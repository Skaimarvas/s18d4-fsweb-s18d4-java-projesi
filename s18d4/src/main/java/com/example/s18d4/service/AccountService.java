package com.example.s18d4.service;

import java.util.List;
import com.example.s18d4.entity.Account;

public interface AccountService {
    List<Account> findAll();
    Account find(long id);
    Account save(Account account);
    Account delete(long id);

}
