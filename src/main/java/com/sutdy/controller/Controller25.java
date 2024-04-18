package com.sutdy.controller;

import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import com.sutdy.domain.MyBean251;
import com.sutdy.domain.Product;
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
@RequestMapping("/main25")
public class Controller25 {
    @Autowired
    private DataSource ds;

    @GetMapping("/sub1")
    public void method4(Model model, @RequestParam("name") String searchName) throws Exception {
        String sql = STR."""
                select * from Employees
                where LastName = '\{searchName}'
                """;

        String sql2 = """
                select * from Employees
                where LastName = '""" + searchName + "'";

        Connection conn = ds.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        List<MyBean251> list = new ArrayList<>();

        try (conn; stmt; rs;) {

            while (rs.next()) {
                String id = rs.getString(1);
                String lastName = rs.getString(2);
                String firstName = rs.getString(3);
                String birthDate = rs.getString(4);
                String photo = rs.getString(5);
                String notes = rs.getString(6);

                MyBean251 obj = new MyBean251(id, lastName, firstName, birthDate, photo, notes);
                list.add(obj);
            }
        }
        model.addAttribute("list", list);
    }

    @GetMapping("/sub2")
    public void method2(@RequestParam(value = "name", required = false) String search, Model model) throws Exception {

        System.out.println("search =" + search);

        String sql = STR."""
                select * from Products where ProductName like '%\{search}%'
                """;


        Connection conn = ds.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        List<Product> list = new ArrayList<>();

        try (conn; stmt; rs;) {

            while (rs.next()) {

                Product product = new Product();

                product.setProductId(rs.getInt(1));
                product.setProductName(rs.getString(2));
                product.setUnit(rs.getString(5));
                product.setPrice(rs.getDouble(6));

                list.add(product);
            }
        }

        model.addAttribute("list", list);
        model.addAttribute("search", search);
    }

    @GetMapping("/sub3")
    public void method3(@RequestParam(value = "name", required = false) String search, Model model) throws Exception {

        String sql = STR."""
                select * from Products where ProductName like ?
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //첫번째 파라미터:물음표 위치
        //두번째 파라미터: 넣을값
        pstmt.setString(1, search);

        ResultSet rs = pstmt.executeQuery();

        List<Product> list = new ArrayList<>();

        while (rs.next()) {
            Product product = new Product();
            product.setProductId(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setCategoryId(rs.getInt(4));
            product.setUnit(rs.getString(5));
            product.setPrice(rs.getDouble(6));

            list.add(product);

        }
        model.addAttribute("list", list);
    }

    @GetMapping("/sub4")
    public void sub4(@RequestParam(value = "name", required = false) String name, Model model) throws Exception {


        String sql = STR."""
                select * from Customers where Customers.CustomerName like ?
                """;

        String nameVal = "%" + name + "%";


        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, nameVal);
        ResultSet rs = pstmt.executeQuery();

        List<Customers> list = new ArrayList<>();

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

        model.addAttribute("list", list);
        model.addAttribute("name", name);
    }


    @GetMapping("/sub6")
    public void sub6(String name, Model model) throws Exception {

        String sql = """
                select *
                from Products
                where productName like ?
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + name + "%");
        ResultSet rs = pstmt.executeQuery();

        List<Product> list = new ArrayList<>();

        while (rs.next()) {
            Product product = new Product();

            product.setProductId(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setUnit(rs.getString(5));
            product.setPrice(rs.getInt(6));

            list.add(product);
        }

        model.addAttribute("list", list);
    }

    @GetMapping("/sub7")
    public void method7(String name, Model model) throws Exception {

        String sql = """
                select * 
                from Customers 
                where CustomerName like ?
                or ContactName like ?
                """;


        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + name + "%");
        pstmt.setString(2, "%" + name + "%");
        ResultSet rs = pstmt.executeQuery();

        List<Customers> list = new ArrayList<>();

        while (rs.next()) {

            Customers customers = new Customers();
            customers.setCustomerId(rs.getString(1));
            customers.setCustomerName(rs.getString(2));
            customers.setContactName(rs.getString(3));
            customers.setAddress(rs.getString(4));
            customers.setCity(rs.getString(5));
            customers.setPostalCode(rs.getString(6));
            customers.setCity(rs.getString(7));

            list.add(customers);
        }

        model.addAttribute("list", list);
    }

    @GetMapping("/sub8")
    public void method8(String name, Model model) throws Exception {

        String sql = """
                select *
                from Employees
                where LastName like ?
                or FirstName like ?
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + name + "%");
        pstmt.setString(2, "%" + name + "%");
        ResultSet rs = pstmt.executeQuery();

        List<Employees> list = new ArrayList<>();

        while (rs.next()) {
            Employees employees = new Employees();
            employees.setEmployeeId(rs.getString(1));
            employees.setLastName(rs.getString(2));
            employees.setFirstName(rs.getString(3));
            employees.setBirthDate(rs.getString(4));
            employees.setPhoto(rs.getString(5));
            employees.setNotes(rs.getString(6));

            list.add(employees);
        }

        model.addAttribute("list", list);
        model.addAttribute("name", name);
    }
}
