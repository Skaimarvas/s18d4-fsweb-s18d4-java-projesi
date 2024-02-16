package com.example.s18d4.controller;


import com.example.s18d4.entity.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workintech/address")
public class AddressController {


    @GetMapping
    public List<Address> findAll(){
        return null;
    }

    @GetMapping("/{id}")
    public Address findAddress(@PathVariable int id){
        return null;
    }

    @PostMapping
    public void addAddress(@RequestBody Address address){

    }
    @PutMapping("/{id}")
    public void updateAddress(){

    }
    @DeleteMapping("/{id}")
    public void deleteAddress(){

    }
}
