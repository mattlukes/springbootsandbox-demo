package com.springbootsandbox.demo.controller;

import com.springbootsandbox.demo.domain.Customer;
import com.springbootsandbox.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("customer")
public class DemoCustomerModelController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/add")
    public String addCustomerForm(Model model)
    {
        model.addAttribute("customer", new Customer());
        return "customer";
    }

    @PostMapping("/add")
    public String addCustomer(@ModelAttribute Customer customer)
    {
        customerRepository.insert(customer);
        return "result";
    }
}
