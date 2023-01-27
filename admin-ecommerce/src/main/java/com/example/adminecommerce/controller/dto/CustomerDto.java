package com.example.adminecommerce.controller.dto;

import com.example.adminecommerce.domain.entity.Customer;
import com.example.adminecommerce.enums.CustomerGrade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.OffsetDateTime;

@AllArgsConstructor
@Builder
@Getter
public class CustomerDto {

    private Long customerId;
    private String customerName;
    private String phoneNumber;
    private String address;
    private CustomerGrade grade;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    public static CustomerDto of(Customer customer) {
        return CustomerDto.builder()
                .customerId(customer.getCustomerId())
                .customerName(customer.getCustomerName())
                .phoneNumber(customer.getPhoneNumber())
                .address(customer.getAddress())
                .grade(customer.getGrade())
                .createdAt(customer.getCreatedAt())
                .updatedAt(customer.getUpdatedAt())
                .build();
    }
}
