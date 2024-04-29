package com.sutdy.service;

import com.sutdy.mapper.Mapper05;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Service01 {

    @Autowired
    private final Mapper05 mapper;

    public List<Mapper05.EmployeeIncome> selectIncomeList(Integer year, Integer month) {

        String from = "%d-%02d-01".formatted(year, month);
        String to = "%d-%02d-31".formatted(year, month);

        return mapper.selectIncomeList(from, to);
    }

    public List<Mapper05.CustomerList> selectMonthandPrice(Integer year, Integer month) {

        String from = "%d-%02d-01".formatted(year, month);
        String to = "%d-%02d-31".formatted(year, month);

        return mapper.selectMonthPrice(from, to);
    }
}
