package com.example.s18d4.controller;


import com.example.s18d4.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workintech/customer")
public class CustomerController {
    @GetMapping
    public List<Customer> findAll(){
        return null;
    }

    @GetMapping("/{id}")
    public Customer findCustomer(@PathVariable int id){
        return null;
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){

    }
    @PutMapping("/{id}")
    public void updateCustomer(){

    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(){

    }
}
