package com.sutdy.controller;


import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import com.sutdy.mapper.Mapper01;
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


@Controller
@RequestMapping("/main31")
public class Controller31 {

    @Autowired
    private DataSource ds;


    //직접 만든 객체(dependency)
    //private Mapper01 mapper = new Mapper01();


    //    private Mapper01 mapper = new Mapper01();
    //Inversion of Control(IOC)
    //Dependency Injection( DI)
    private Mapper01 mapper;


    @GetMapping("/sub1")
    public void method1(Integer id, Model model) throws Exception {


        Customers c = mapper.getCustomerById(id);
        model.addAttribute("customer", c);
    }

    @PostMapping("/sub1/update")
    public String update1(Customers customer, Integer id, RedirectAttributes rttr) throws Exception {

        String sql = """
                update Customers
                set CustomerName = ?,
                contactName = ?,
                address = ?,
                city = ?,
                postalCode = ?,
                country = ?
                where customerId = ?
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        try (pstmt; conn) {

            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getContactName());
            pstmt.setString(3, customer.getAddress());
            pstmt.setString(4, customer.getCity());
            pstmt.setString(5, customer.getPostalCode());
            pstmt.setString(6, customer.getCountry());
            pstmt.setInt(7, id);

            int row = pstmt.executeUpdate();

            if (row > 0) {
                rttr.addFlashAttribute("message", customer.getCustomerId() + "번 고객 수정");
            } else {
                rttr.addFlashAttribute("message", "수정 실패");
            }
        }

        rttr.addAttribute("id", customer.getCustomerId());
        return "redirect:/main31/sub1";
    }

    @GetMapping("/sub2")
    public void method2(Integer id, Model model) throws Exception {


        if (id != null) {

            String listSql = """
                     
                         select *
                     from Employees
                     where EmployeeId = ?
                       

                    """;

            Connection conn = ds.
                    getConnection();
            PreparedStatement pstmt = conn.
                    prepareStatement(listSql);
            pstmt.setInt(1, id);

            ResultSet

                    rs = pstmt.executeQuery();

            try (rs; pstmt; conn) {


                if (rs.next()) {
                    Employees
                            employees = new Employees();
                    employees.setEmployeeId(rs.getString(1));
                    employees.setLastName(rs.getString(2));
                    employees.setFirstName(rs.getString(3));
                    employees.setBirthDate(rs.getString(4));
                    employees.setPhoto(rs.getString(5));
                    employees.setNotes(rs.getString(6));

                    model.addAttribute("list", employees)
                    ;
                    model.addAttribute("id", id);
                }
            }
        }
    }

    @PostMapping("/sub2/update")
    public String method2(Employees employees, Integer id, Model model, RedirectAttributes rttr) throws Exception {

        String updateSql = """
                update Employees
                set lastName = ?,
                firstName =?,
                birthDate =?,
                photo =?,
                notes =?
                where employeeId = ?
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(updateSql);

        try (pstmt; conn;) {


            pstmt.setString(1, employees.getLastName());
            pstmt.setString(2, employees.getFirstName());
            pstmt.setString(3, employees.getBirthDate());
            pstmt.setString(4, employees.getPhoto());
            pstmt.setString(5, employees.getNotes());
            pstmt.setInt(6, id);

            int row = pstmt.executeUpdate();
            if (row > 0) {
                rttr.addFlashAttribute("message", "수정 성공");
            } else {
                rttr.addFlashAttribute("message", "수정실패");
            }

        }

        rttr.addAttribute("id", id);
        return "redirect:/main31/sub2";
    }
}
