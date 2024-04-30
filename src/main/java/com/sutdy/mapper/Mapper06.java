package com.sutdy.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Mapper06 {

    @Update("""
            update mydb2.bank
            set money = money -500
            where name = '강인'
            """)
    int minusMoney();

    @Update("""
            update mydb2.bank
            set money = money + 500
            where name = '흥민'
            """)
    int plusMoney();
}
