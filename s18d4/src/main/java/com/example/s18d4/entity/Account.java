package com.example.s18d4.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "account", schema = "fsweb")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "money_amount")
    private double moneyAmount;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
