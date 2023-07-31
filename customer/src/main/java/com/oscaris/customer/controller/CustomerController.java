package com.oscaris.customer.controller;

import com.oscaris.customer.DTO.CustomerModel;
import com.oscaris.customer.entity.Customer;
import com.oscaris.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody CustomerModel customerModel){
        Customer customer = customerService.register(customerModel);
        return new ResponseEntity<>(customer,HttpStatus.CREATED);
    }
}
