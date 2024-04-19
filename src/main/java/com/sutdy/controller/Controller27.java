package com.sutdy.controller;


import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main27")
public class Controller27 {

    @Autowired
    private DataSource ds;

    @GetMapping("/sub1")
    public String sub1(@RequestParam(defaultValue = "1") Integer page, Model model) throws Exception {

//        if (page == null) {
//            page = 1;
//        }

        int offset = (page - 1) * 10;

        String sql = """
                select *
                from Customers
                order by CustomerID
                limit ?, 10
                """;

        Connection conn = ds.getConnection();


        //페이지 정보 산출
        //총 레코드 수 조회
        String countSql = "select count(*) from Customers";
        Statement stmt = conn.createStatement();
        ResultSet rs1 = stmt.executeQuery(countSql);
        int total = 0;
        try (rs1; stmt;) {
            if (rs1.next()) {
                total = rs1.getInt(1);
            }
        }
        //마지막 페이지 번호
        int lastPageNumber = (total - 1) / 10 + 1;
        model.addAttribute("lastPageNumber", lastPageNumber);

        //페이지 링크의 begin, end 산출
        int endPageNumber = (((page - 1) / 10) + 1) * 10;
        int beginPageNumber = endPageNumber - 9;

        //endPageNumber가 최종페이지를 넘을순 없다
        endPageNumber = Math.min(endPageNumber, lastPageNumber);

        model.addAttribute("beginPageNumber", beginPageNumber);
        model.addAttribute("endPageNumber", endPageNumber);

        //다음 버튼 클릭 시 이동해야 하는 페이지 nextPageNumber 산출
        int nextPageNumber = beginPageNumber + 10;
        if (nextPageNumber <= lastPageNumber) {
            model.addAttribute("nextPageNumber", nextPageNumber);
        }

        //이전 버튼 클릭시 이동해야 하는 페이지 prevPageNumber
        int prevPageNumber = beginPageNumber - 10;
        if (prevPageNumber >= 1) {
            model.addAttribute("prevPageNumber", prevPageNumber);
        }

        //현제 페이지
        model.addAttribute("currentPage", page);


        //고객 레코드 조회
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, offset);
        ResultSet rs = pstmt.executeQuery();

        List<Customers> list = new ArrayList<>();

        try (rs; pstmt; conn;) {
            while (rs.next()) {
                Customers customer = new Customers();
                customer.setCustomerId(rs.getString(1));
                customer.setCustomerName(rs.getString(2));
                customer.setContactName(rs.getString(3));
                customer.setAddress(rs.getString(4));
                customer.setCity(rs.getString(5));
                customer.setPostalCode(rs.getString(6));
                customer.setCountry(rs.getString(7));

                list.add(customer);
            }
        }
        model.addAttribute("list", list);


        return "main27/sub1";
    }

    @GetMapping("/sub2")
    public String sub2(@RequestParam(defaultValue = "1") Integer page, Model model) throws Exception {

        Connection conn = ds.getConnection();
        String listSql = """
                select *
                from Employees
                order by EmployeeID
                limit ?,10
                """;

        // 현재 3page => 20 ~30
        int offset = (page - 1) * 10;

        PreparedStatement pstmt = conn.prepareStatement(listSql);
        pstmt.setInt(1, offset);
        ResultSet rs = pstmt.executeQuery();

        List<Employees> employeesList = new ArrayList<>();
        try (rs; pstmt;) {

            while (rs.next()) {

                Employees data = new Employees();
                data.setEmployeeId(rs.getString(1));
                data.setLastName(rs.getString(2));
                data.setFirstName(rs.getString(3));
                data.setBirthDate(rs.getString(4));
                data.setPhoto(rs.getString(5));
                data.setNotes(rs.getString(6));

                employeesList.add(data);
            }
        }


        //총 글 개수
        String countSql = "select count(*) from Employees";

        Statement stmt = conn.createStatement();
        ResultSet rs1 = stmt.executeQuery(countSql);

        int totalCount = 0;

        try (rs1; stmt; conn;) {
            if (rs1.next()) {
                totalCount = rs1.getInt(1);
            }
        }

        //끝페이지
        int endPage = 0;
        if (totalCount % 10 == 0) {
            endPage = totalCount / 10;
        } else if (totalCount % 10 != 0) {
            endPage = totalCount / 10 + 1;
        }

        //현재 보고있는 페이지에서 끝페이지 (총끝페이지가 아닌) ex)40p
        int currentEndPage = (((page - 1) / 10) + 1) * 10;

        //currentEndPage endPage currentEndPage = 40 endpage 37
        int currentStartPage = currentEndPage - 9;

        if (currentEndPage > endPage) {
            currentEndPage = endPage;
        }

        //현재 보고있는 페이지에서 시작페이지


        //다음 눌럿을때 ex)25p 21 ~30 , 다음누르면 31 ~ 40
        int nextPage = currentStartPage + 10;
        int prevPage = currentStartPage - 10;


        model.addAttribute("employeesList", employeesList);
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("endPage", endPage);
        model.addAttribute("currentPage", page);
        model.addAttribute("currentEndPage", currentEndPage);
        model.addAttribute("currentStartPage", currentStartPage);
        model.addAttribute("nextPage", nextPage);
        model.addAttribute("prevPage", prevPage);

        return "main27/sub2";
    }
}
