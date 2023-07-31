package com.oscaris.customer.service;

import com.oscaris.customer.DTO.CustomerModel;
import com.oscaris.customer.entity.Customer;
import com.oscaris.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public String setId(){
        return UUID.randomUUID().toString()
                .replace("-", "")
                .substring(0, 12);
    }
    public Customer register(CustomerModel customerModel) {
        Customer customer = Customer.builder()
                .customerId(setId())
                .customerEmail(customerModel.getCustomerEmail())
                .phoneNumber(customerModel.getPhoneNumber())
                .password(customerModel.getPassword())
                .username(customerModel.getUsername())
                .build();
        return customerRepository.save(customer);
    }
}
