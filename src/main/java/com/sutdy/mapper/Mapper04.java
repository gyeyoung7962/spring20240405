package com.sutdy.mapper;


import com.sutdy.domain.MyBean331;
import com.sutdy.domain.MyBean332;
import com.sutdy.domain.MyBean333;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface Mapper04 {

    @Select("""
            select string_col, 
                   int_col, 
                   dec_col, 
                   date_col, 
                   date_time_col
            from my_table9
            """)
    public List<MyBean331> select1();


    @Select("""
            select *
            from my_table9
            """)
    List<MyBean332> select2();

    @Select("""
            select *
            from my_table10
            """)
    List<MyBean333> select3();

    @Insert("""
            insert into my_table9(string_col, int_col, dec_col, date_col, date_time_col)
            values  (#{c1}, #{c2}, #{c3}, #{c4}, #{c5})
            """)
    void insert1(String c1, String c2, String c3, String c4, String c5);

    @Insert("""
            insert into my_table9(string_col, int_col, dec_col, date_col, date_time_col)
            values (#{strVal}, #{intVal}, #{doubleVar}, #{dateVal}, #{dateTimeVal})
            """)
    void insert2(String strVal, Integer intVal, Double doubleVal, LocalDate dateVal, LocalDateTime dateTimeVal);


    @Insert("""
            insert into my_table9(string_col, int_col, dec_col, date_col, date_time_col)
            values (#{stringCol}, #{intCol}, #{decCol}, #{dateCol}, #{dateTimeCol})
            """)
    int insert222(MyBean332 myBean332);

    @Insert("""
            insert into my_table10(title, name, age, price, published, inserted)
            values (#{title}, #{name}, #{age}, #{price}, #{published}, #{inserted})
            """)
    int insert3(MyBean333 myBean333);

    @Insert("""
            insert into my_table9(string_col, int_col, dec_col, date_col, date_time_col)
            values (#{stringCol}, #{intCol}, #{decCol}, #{dateCol}, #{dateTimeCol})
            """)
    void insert4(MyBean332 obj);

    @Insert("""
            insert into my_table10(title, name, age, price, published, inserted)
            values (#{title}, #{name}, #{age}, #{price}, #{published}, #{inserted})
            """)
    void insert5(MyBean333 obj);

    @Select("""
            select *
            from my_table10
            where title like #{keyword}
                        
            """)
    List<MyBean333> search(String keyword);
}
