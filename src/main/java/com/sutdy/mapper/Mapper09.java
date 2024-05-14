package com.sutdy.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper09 {

    @Select("""
            select CustomerName
            from Customers
            where CustomerID = #{id}           
            """)
    String selectNameById(Integer id);
}
