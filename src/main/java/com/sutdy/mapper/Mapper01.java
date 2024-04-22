package com.sutdy.mapper;

import com.sutdy.domain.Customers;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Inversion of Controller (IOC)
@Component
public class Mapper01 {


    public Customers getCustomerById(Integer id) throws Exception {
        //connection, preparedStatement, resultSet 객체 만들고 리턴

        if (id != null) {

            String listSql = """
                        select *
                     from Customers
                     where CustomerId = ?
                    """;

            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/w3schools", "root", "1234");
            PreparedStatement pstmt = conn.prepareStatement(listSql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            try (rs; pstmt; conn) {
                if (rs.next()) {
                    Customers data = new Customers();
                    data.setCustomerId(rs.getString(1));
                    data.setCustomerName(rs.getString(2));
                    data.setContactName(rs.getString(3));
                    data.setAddress(rs.getString(4));
                    data.setCity(rs.getString(5));
                    data.setPostalCode(rs.getString(6));
                    data.setCountry(rs.getString(7));

                    return data;
                }

            }

        }
        return null;
    }
}

