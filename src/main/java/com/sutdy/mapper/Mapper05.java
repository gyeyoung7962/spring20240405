package com.sutdy.mapper;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper05 {


    @Data
    static class EmployeeIncome {
        private Integer employeeId;
        private String lastName;
        private String firstName;
        private Double income;
    }

    @Select("""
            SELECT e.EmployeeId,
                   e.LastName,
                   e.FirstName,
                   SUM(od.Quantity * p.Price) AS income
            FROM Orders o JOIN Employees e ON o.EmployeeId = e.EmployeeId
                          JOIN OrderDetails od ON o.OrderId = od.OrderId
                          JOIN Products p ON od.ProductId = p.ProductId
            WHERE o.OrderDate BETWEEN #{from} AND #{to}
            GROUP BY e.EmployeeId
            ORDER BY income DESC
            """)
    List<EmployeeIncome> selectIncomeList(String from, String to);


    @Data
    static class CustomerList {
        private String customerName;
        private Integer sumPrice;
    }

    @Select("""
            select c.CustomerName, sum(od.Quantity * p.Price) sumPrice
            from Customers c
                     join Orders o
                          on c.CustomerID = o.CustomerID
                     join OrderDetails od
                          on o.OrderID = od.OrderID
                     join Products p
                          on p.ProductID = od.ProductID
            where o.OrderDate between #{year} and #{month}
            group by c.CustomerID
            order by sumPrice desc;
            """)
    public List<CustomerList> selectMonthPrice(String year, String month);

}
