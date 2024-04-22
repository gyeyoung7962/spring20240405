package com.sutdy.controller;

import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
@RequestMapping("/main30")
public class Controller30 {

    @Autowired
    private DataSource ds;

    @GetMapping("/sub1")
    public void method1(Integer id, Model model) throws Exception {

        if (id != null) {

            String listSql = """
                     
                         select *
                     from Customers
                     where CustomerId = ?
                       

                    """;

            Connection conn = ds.
                    getConnection();
            PreparedStatement pstmt = conn.
                    prepareStatement(listSql);
            pstmt.setInt(1, id);
            ResultSet

                    rs = pstmt.
                    executeQuery();

            try (rs; pstmt; conn) {
                if (rs.next()) {
                    Customers data = new Customers();
                    data.setCustomerId(rs.getString(1));
                    data.setCustomerName(rs.getString(2));
                    data.setContactName(rs.getString(3));
                    data.setAddress(rs.getString(4))
                    ;
                    data.setCity(rs.
                            getString(5));
                    data.

                            setPostalCode(rs.getString(6));
                    data.
                            setCountry(rs.getString(7));

                    model.addAttribute("id", id);

                    model.addAttribute("list", data);

                }
            }
        }
    }

    @PostMapping("/sub1/delete")
    public String method2(Integer id, RedirectAttributes rttr, Model model) throws Exception {

        String sql = """
                delete 
                from Customers
                where CustomerId = ?
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        try (pstmt; conn) {
            int rowCount = pstmt.executeUpdate();

            if (rowCount > 0) {
                rttr.addFlashAttribute("message", "고객삭제 완료");
            } else {
                rttr.addFlashAttribute("message", "삭제가 안됬습니다");
            }
        }


        model.addAttribute("id", id);

        return "redirect:/main30/sub1";
    }

    @GetMapping("/sub2")
    public void method2(Integer id, Model model) throws SQLException {

        if (id != null) {


            String listSql = """
                    select *
                    from Employees
                    where EmployeeId = ?
                    """;

            Connection conn = ds.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(listSql);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();

            try (rs; pstmt; conn) {


                if (rs.next()) {
                    Employees data = new Employees();

                    data.setEmployeeId(rs.getString(1));
                    data.setLastName(rs.getString(2));
                    data.setFirstName(rs.getString(3));
                    data.setBirthDate(rs.getString(4));
                    data.setPhoto(rs.getString(5));
                    data.setNotes(rs.getString(6));

                    model.addAttribute("list", data);
                }
            }

            model.addAttribute("id", id);
        }
    }

    @PostMapping("/sub2/delete")
    public String method3(Integer id, RedirectAttributes rttr, Model model) throws SQLException {

        String deleteSql = """
                delete from Employees
                where EmployeeId = ?
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(deleteSql);
        pstmt.setInt(1, id);

        try (pstmt; conn) {

            int rowCnt = pstmt.executeUpdate();

            if (rowCnt > 0) {
                rttr.addFlashAttribute("message", "삭제 완료");
            } else {
                rttr.addFlashAttribute("message", "삭제실패");
            }

        }

        model.addAttribute("id", id);

        return "redirect:/main30/sub2";
    }
}
