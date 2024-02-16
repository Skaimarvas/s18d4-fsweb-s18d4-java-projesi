package com.example.s18d4.service;

import com.example.s18d4.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer save(Customer customer);
    Customer find(long id);
    Customer delete(long id);
}
