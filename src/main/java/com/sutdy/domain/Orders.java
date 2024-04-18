package com.sutdy.domain;


import lombok.Data;

@Data
public class Orders {
    private String orderId;
    private String customerId;
    private String employeeId;
    private String orderDate;
    private String shipperId;
}
