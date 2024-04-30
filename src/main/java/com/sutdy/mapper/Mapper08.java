package com.sutdy.mapper;


import com.sutdy.domain.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper08 {


    @Select("""
            <script>
            select *
            from Employees
            where lastName = 'abc'
            <if test="false">
            or firstName = 'abc'
            </if>
            </script>
            """)
    public List<Employees> query1();


    @Select("""
            <script>
            select *
            from my_table
            <if test="lastName != null">
                  -- lastName != null     
            </if>
            <if test="lastName == null">
                -- lastName == null
            </if>
            </script>
            """)
    Object query2(Employees e);


    @Select("""
            <script>
            select *
            from my_table
            <if test="firstName == 'lee'">
            -- firstName이 lee 일때
            </if>
            <if test="firstName != 'lee'">
            -- firstName이 lee가 아닐때
            </if>
            </script>
            """)
    Object query3(Employees e);


    @Select("""
            <script>
            select *
            from Employees
            <if test="firstName == null">
            -- firstName이 null
            </if>        
            <if test="firstName != null">
            -- firstName이 null 아님
            </if>
            <if test="firstName == 'kim'">
            -- firstName이 kim
            </if>
            <if test="firstName == 'lee'">
            -- firstName이 lee
            </if>
            </script>
            """)
    Object query4(Employees e);


    @Select("""
            <script>
            select *
            from my_table
            <trim prefix="where" prefixOverrides="OR">
            <if test="lastName != null">
            Or lastName = #{lastName}
            </if>
            <if test="firstName != null">
            or firstName = #{firstName}
            </if>
            </trim>
            </script>
            """)
    Object query5(Employees e);


    @Select("""
            <script>
            <bind name="patternKeyword" value ='"%"+ keyword+"%"'/>
            select *
            from Employees
            where notes like #{patternKeyword}
            </script>
            """)
    List<Employees> query6(String keyword);

    @Select("""
            <script>
            <![CDATA[
            select *
            from Products
            where Price < 5
            ]]>
            </script>
            """)
    Object query7();
}
