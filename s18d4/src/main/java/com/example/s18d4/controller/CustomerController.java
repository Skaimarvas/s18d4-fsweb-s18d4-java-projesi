package com.example.s18d4.controller;


import com.example.s18d4.dto.CustomerResponse;
import com.example.s18d4.entity.Customer;
import com.example.s18d4.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workintech/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;

    }
    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findCustomer(@PathVariable int id){
        return customerService.find(id);
    }

    @PostMapping
    public CustomerResponse save(@RequestBody Customer customer){
        if (customer != null){
            customerService.save(customer);
        } else {
            throw new RuntimeException("Customer object is empty!");
        }
        return new CustomerResponse(customer.getId(), customer.getEmail(), customer.getSalary());
    }
    @PutMapping("/{id}")
    public CustomerResponse update(@RequestBody Customer customer, @PathVariable long id){
          Customer customerFound = customerService.find(id);
          if(customerFound == null){
              throw new RuntimeException("Customemr(" + id + ") not found");
          }
          customerFound = customer;

          return new CustomerResponse(customerFound.getId(), customerFound.getEmail(), customerFound.getSalary());
    }
    @DeleteMapping("/{id}")
    public CustomerResponse remove(@PathVariable long id){
         Customer customer = customerService.find(id);
         if (customer != null){
             customerService.delete(id);
             return new CustomerResponse(customer.getId(), customer.getEmail(), customer.getSalary());
         } else {
             throw new RuntimeException("No customer found");
         }
    }
}
