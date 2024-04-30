package com.sutdy.service;


import com.sutdy.domain.Employees;
import com.sutdy.mapper.Mapper08;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class Servcie04 {

    @Autowired
    private final Mapper08 mapper;


    public void action1() {
        mapper.query1();
    }

    public void action2() {
        Employees e = new Employees();
//        e.setLastName("흥민");
        mapper.query2(e);
    }

    public void action3() {
        Employees e = new Employees();
        e.setFirstName("lee");
        mapper.query3(e);
    }

    public void action4() {
        Employees e = new Employees();
        e.setFirstName("kim");
        e.setFirstName("lee");
        mapper.query4(e);
    }

    public void action5() {
        Employees e = new Employees();
        e.setLastName("지성");
        e.setFirstName("hm");
        mapper.query5(e);
    }

    public void action6(String keyword) {

        List<Employees> list = mapper.query6(keyword);
        list.forEach(System.out::println);
    }

    public void action7() {

        mapper.query7();
    }
}
