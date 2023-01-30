package com.example.adminecommerce.controller;

import com.example.adminecommerce.controller.dto.CustomerDto;
import com.example.adminecommerce.domain.entity.Customer;
import com.example.adminecommerce.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    private final String CUSTOMERS_ATTRIBUTE_KEY = "customers";

    @GetMapping("/customers")
    public String customers(@PageableDefault Pageable pageable, Model model) {
        List<Customer> customers = customerService.findAllByActivateCustomer(pageable);
        List<CustomerDto> customerDtoList = customers.stream()
                .map(customer -> CustomerDto.of(customer))
                .collect(Collectors.toList());

        model.addAttribute(CUSTOMERS_ATTRIBUTE_KEY, customerDtoList);
        return "/customers/customer";
    }


}
