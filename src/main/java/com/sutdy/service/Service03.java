package com.sutdy.service;


import com.sutdy.domain.Customers;
import com.sutdy.domain.Employees;
import com.sutdy.mapper.Mapper07;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class Service03 {

    @Autowired
    private final Mapper07 mapper;


    public void insertData() {
        Employees e = new Employees();
        e.setLastName("박");
        e.setFirstName("지성");
        mapper.insert(e);

        System.out.println(e.getEmployeeId());
    }

    public void insertData2() {
        Customers c = new Customers();

        //새 고객 데이터 입력하고 다음 출력 코드에서 새 고객의 키가 출력되도록 코드작성
        c.setCustomerName("박지성");
        c.setCountry("대한민국");
        c.setCity("서울");
        c.setContactName("캡틴");
        mapper.insert2(c);

        System.out.println(c.getCustomerId());
    }
}
