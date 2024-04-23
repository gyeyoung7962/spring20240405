package com.sutdy.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {

    private String employeeId;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String photo;
    private String notes;
}
