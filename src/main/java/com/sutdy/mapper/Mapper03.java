package com.sutdy.mapper;


import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Mapper03 {


    @Delete("""
            DELETE from
            Customers
            where CustomerID = #{id}
            """)
    public int deleteOneCustomerById(Integer id);

    @Insert("""
            INSERT INTO Customers(customername, contactname, address, city, postalcode, country)
                values (#{customerName}, #{contactName}, #{address}, #{city}, #{postalCode}, #{country})
            """)
    int insertCustomer(Customers customers);

    @Insert("""
            INSERT INTO Employees(LastName, FirstName, BirthDate, Photo, Notes)
            values (#{lastName}, #{firstName}, #{birthDate}, #{photo}, #{notes})
            """)
    int insertEmployees(Employees employees);
}
