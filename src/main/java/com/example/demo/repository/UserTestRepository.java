package com.example.demo.repository;

import com.example.demo.entity.UserTest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserTestRepository extends JpaRepository<UserTest, Long> {
}
