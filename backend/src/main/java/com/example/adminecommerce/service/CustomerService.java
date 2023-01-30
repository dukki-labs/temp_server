package com.example.adminecommerce.service;

import com.example.adminecommerce.domain.entity.Customer;
import com.example.adminecommerce.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public List<Customer> findAllByActivateCustomer(Pageable pageable) {
        return customerRepository.findByIsDeletedIsFalse(pageable);
    }
}
