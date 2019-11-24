package com.springbootsandbox.demo.controller;

import com.springbootsandbox.demo.domain.Customer;
import com.springbootsandbox.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("searchCustomer")
public class DemoCustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/lastName/{lastName}")
    public List<Customer> getAllCustomers(@PathVariable("lastName") String lastName)
    {
        return customerRepository.findByLastName(lastName);
    }
}
