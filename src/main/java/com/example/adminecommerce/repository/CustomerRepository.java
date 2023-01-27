package com.example.adminecommerce.repository;

import com.example.adminecommerce.domain.entity.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByIsDeletedIsFalse(Pageable pageable);

    List<Customer> findByCustomerName(String name);
}
