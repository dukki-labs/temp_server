package com.example.demo.entity;

import com.example.demo.dto.User;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class UserTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String status;

    public void createUser(User user) {
        this.name = user.getName();
        this.status = user.getStatus();
    }
}