package com.example.s18d4.controller;

import com.example.s18d4.entity.Account;
import com.example.s18d4.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workintech/account")
public class AccountController {
    @GetMapping
    public List<Account> findAll(){
        return null;
    }

    @GetMapping("/{id}")
    public Account findAccount(@PathVariable int id){
        return null;
    }

    @PostMapping
    public void addAccount(@RequestBody Account account){

    }
    @PutMapping("/{id}")
    public void updateAccount(){

    }
    @DeleteMapping("/{id}")
    public void deleteAccount(){

    }
}
