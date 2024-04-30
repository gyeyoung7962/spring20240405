package com.sutdy.mapper;


import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface Mapper07 {

    @Insert("""
            insert into Employees(lastName, firstName)
            value (#{lastName}, #{firstName})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "employeeId")
    public int insert(Employees e);

    @Insert("""
            insert into Customers(ContactName, CustomerName, Country, City)
            values(#{contactName}, #{customerName}, #{country}, #{city})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "customerId")
    void insert2(Customers c);
}
