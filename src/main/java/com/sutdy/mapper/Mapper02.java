package com.sutdy.mapper;


import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import com.sutdy.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface Mapper02 {

    @Select("SELECT now()")
    public String selectNow();

    //조회 결과의 컬럼명과 리턴타입의 객체 프로퍼티명이 같으면 값을 바인딩 해줌
    @Select("select ContactName, Address, city, Country from Customers where CustomerID = #{id}")
    public Customers selectOneCustomer();

    @Select("""
            SELECT *
            From Customers
            Where CustomerID = 1
            """)
    public Customers selectOneCustomer2();

    @Select("""
            select 
                    customerid id,
                    customername name, 
                    contactname, 
                    address addr, 
                    city, 
                    postalcode, 
                    country
            from Customers
            where CustomerID = 1
            """)
    Customers selectOneCustomer3();


    @Select("""
            select *
            from Employees
            where EmployeeID = 2
            """)
    Employees selectOneEmployee1();

    @Select("""
            select *
            from Employees
            where EmployeeID = #{id}
            """)
    Employees selectOneEmployee2(String id);


    @Select("select * from Customers where CustomerID = #{id}")
    Customers selectOneCustomer4(@RequestParam("customerId") Integer id);


    @Select("""
            select 
                    customerid id,
                    customername name, 
                    contactname, 
                    address addr, 
                    city, 
                    postalcode, 
                    country
            from Customers
            """)
    List<Customers> selectAllCustomer1();


    @Select("""
            select employeeid, lastname, firstname, birthdate, photo, notes
            from Employees;
            """)
    List<Employees> selectAllEmployees();

    @Select("""
            select *
            from Customers
            where Country = #{country1}
                    or Country = #{country2}
            """)
    List<Customers> selectCustomersByCountry(String country1, String country2);

    @Select("""
            select *
            from Products
            where Price >= #{i} and Price <= #{i1}
            """)
    List<Product> selectProductByPrice(double i, double i1);

    @Update("""
            UPDATE Employees
            set LastName =#{lastName}, FirstName = #{firstName}, BirthDate = #{birthDate}, Photo = #{photo}, notes = #{notes}
            where EmployeeID = #{employeeId}
            """)
    int updateEmployeebyId(Employees employees);


    @Delete("""
            delete from
            Employees
            where EmployeeID = #{employeeId}
            """)
    int deleteEmployeeById(String employeeId);
}
