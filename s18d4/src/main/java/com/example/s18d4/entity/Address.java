package com.example.s18d4.entity;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "adress", schema = "fsweb")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "street")
    private String street;
    @Column(name = "no")
    private int no;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Nullable
    @Column(name = "description")
    private String description;

}
