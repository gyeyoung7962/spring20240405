package com.sutdy.controller;


import com.sutdy.domain.Category;
import com.sutdy.domain.Customers;
import com.sutdy.domain.Orders;
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
@RequestMapping("/main26")
public class Controller26 {

    @Autowired
    private DataSource ds;

    @GetMapping("/sub1")
    public String sub1(String start, String end, Model model) throws Exception {

        String sql = """
                select *
                from Orders
                where OrderDate between ? and ?
                """;

        Connection conn = ds.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, start);
        pstmt.setString(2, end);
        ResultSet rs = pstmt.executeQuery();

        List<Orders> list = new ArrayList<>();

        try (conn; pstmt; rs;) {

            while (rs.next()) {

                Orders order = new Orders();

                order.setOrderId(rs.getString(1));
                order.setCustomerId(rs.getString(2));
                order.setEmployeeId(rs.getString(3));
                order.setOrderDate(rs.getString(4));
                order.setShipperId(rs.getString(5));

                list.add(order);
            }
        }

        model.addAttribute("start", start);
        model.addAttribute("end", end);
        model.addAttribute("list", list);

        return "main26/sub1";
    }

    @GetMapping("sub2")
    public String method2(String[] country, Model model) throws Exception {
        Connection conn = ds.getConnection(); //연결 객체 생성

        if (country != null && country.length > 0) {  //country를 선택했을때 실행
            String questionMarks = ""; // ? 매핑
            for (int i = 0; i < country.length; i++) { // 나라가 선택된만큼 물음표 개수 추가
                questionMarks = questionMarks + "?";
                if (i != country.length - 1) { // 마지막나라가 선택되기 전까지 ? , 따음표 추가
                    questionMarks = questionMarks + ",";
                }
            }
            String customerSql = STR."""
                SELECT *
                FROM Customers
                WHERE Country IN (\{questionMarks})
                """;

            var list = new ArrayList<Customers>();
            PreparedStatement pstmt = conn.prepareStatement(customerSql);
            for (int i = 0; i < country.length; i++) {
                pstmt.setString((i + 1), country[i]);
            }
            ResultSet resultSet = pstmt.executeQuery();
            try (pstmt; resultSet) {

                while (resultSet.next()) {
                    Customers data = new Customers();
                    data.setCustomerId(resultSet.getString(1));
                    data.setCustomerName(resultSet.getString(2));
                    data.setContactName(resultSet.getString(3));
                    data.setAddress(resultSet.getString(4));
                    data.setCity(resultSet.getString(5));
                    data.setPostalCode(resultSet.getString(6));
                    data.setCountry(resultSet.getString(7));
                    list.add(data);
                }
                model.addAttribute("list", list);
            }
        }

        String sql = """
                SELECT DISTINCT Country
                FROM Customers
                """;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        var countryList = new ArrayList<String>();
        try (stmt; rs; conn) {
            while (rs.next()) {
                countryList.add(rs.getString(1));
            }
            model.addAttribute("countryList", countryList);
        }

        return "main25/sub4";
    }

    @GetMapping("sub3")
    public String method3(String[] categoryName, Model model) throws Exception {
        Connection conn = ds.getConnection();

        if (categoryName != null && categoryName.length > 0) {  //country를 선택했을때 실행
            String questionMarks = ""; // ? 매핑하기 위해 생성
            for (int i = 0; i < categoryName.length; i++) { // 나라가 선택된만큼 물음표 개수 추가
                questionMarks = questionMarks + "?";
                if (i != categoryName.length - 1) { // 마지막나라가 선택되기 전까지 ? , 따음표 추가
                    questionMarks = questionMarks + ",";
                }
            }
            String categorySql = STR."""
                SELECT *
                FROM Categories
                WHERE CategoryID IN (\{questionMarks})
                """;

            var list = new ArrayList<Category>(); //카테고리 list 생성
            PreparedStatement pstmt = conn.prepareStatement(categorySql);
            for (int i = 0; i < categoryName.length; i++) {
                pstmt.setString((i + 1), categoryName[i]); //선택된 카테고리의 값만큼 ?는  1번부터라서 1번부터 넘겨온 이름만큼 셋팅해준다
            }
            ResultSet rs = pstmt.executeQuery();
            try (pstmt; rs;) {

                while (rs.next()) {
                    Category data = new Category();
                    data.setCategoryId(rs.getInt(1));
                    data.setCategoryName(rs.getString(2));
                    data.setDescription(rs.getString(3));
                    list.add(data);
                }
                model.addAttribute("list", list);
            }
        }


        String categorySql = "SELECT * FROM Categories";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(categorySql);
        var categoryList = new ArrayList<Category>();
        try (rs; stmt;) {
            while (rs.next()) {
                Category category = new Category();
                category.setCategoryId(rs.getInt(1));
                category.setCategoryName(rs.getString(2));

                categoryList.add(category);
            }
            model.addAttribute("categoryList", categoryList);
        }


        String productSql = """
                select *
                from Products
                where categoryId in (?,?,?)
                """;


        PreparedStatement pstmt = conn.prepareStatement(productSql);
        pstmt.setString(1, categoryName[0]);
        pstmt.setString(2, categoryName[1]);
        pstmt.setString(3, categoryName[2]);
        ResultSet rs1 = pstmt.executeQuery();

        List<Product> productList = new ArrayList<>();

        while (rs1.next()) {

            Product product = new Product();
            product.setProductId(rs1.getInt(1));
            product.setProductName(rs1.getString(2));
            product.setCategoryId(rs1.getInt(4));
            product.setUnit(rs1.getString(5));
            product.setPrice(rs1.getDouble(6));

            productList.add(product);
        }

        model.addAttribute("productList", productList);


        return "main25/sub6";
    }


    @GetMapping("sub4")
    public String method4(@RequestParam(value = "category", required = false) String[] categorySelect,
                          Model model) throws Exception {
        Connection conn = ds.getConnection();

        if (categorySelect != null && categorySelect.length > 0) {

            String marks = "";
            for (int i = 0; i < categorySelect.length; i++) {
                marks += "?";
                if (i != categorySelect.length - 1) {
                    marks += ",";
                }
            }
            String sql = STR."""
                SELECT *
                FROM Products
                WHERE CategoryId IN (\{marks})
                """;

            PreparedStatement pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < categorySelect.length; i++) {
                pstmt.setString((i + 1), categorySelect[i]);
            }

            ResultSet resultSet = pstmt.executeQuery();

            var productList = new ArrayList<Product>();
            try (resultSet; pstmt;) {

                while (resultSet.next()) {
                    Product p = new Product();
                    p.setProductId(resultSet.getInt(1));
                    p.setProductName(resultSet.getString(2));
                    p.setCategoryId(resultSet.getInt(4));
                    p.setUnit(resultSet.getString(5));
                    p.setPrice(resultSet.getDouble(6));

                    productList.add(p);
                }
                model.addAttribute("prevCategorySelect", categorySelect);
                model.addAttribute("products", productList);
            }
        }


        String categorySql = "SELECT * FROM Categories";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(categorySql);
        var categoryList = new ArrayList<Category>();
        try (rs; stmt;) {
            while (rs.next()) {
                Category category = new Category();
                category.setCategoryId(rs.getInt(1));
                category.setCategoryName(rs.getString(2));

                categoryList.add(category);
            }
            model.addAttribute("categoryList", categoryList);
        }

        return "main26/sub6ProductList";
    }
}