package com.example.adminecommerce.domain.entity;

import com.example.adminecommerce.enums.CustomerGrade;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long customerId;

    @Column(name = "name")
    private String customerName;

    private int age;

    private String phoneNumber;

    private String address;

    @Enumerated(value = EnumType.STRING)
    private CustomerGrade grade;

    private boolean isDeleted;

    private String createdBy;

    @CreatedDate
    private OffsetDateTime createdAt;

    private String updatedBy;

    @LastModifiedDate
    private OffsetDateTime updatedAt;
}
