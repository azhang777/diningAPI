package com.restaurant.diningapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;

@RequiredArgsConstructor
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private LinkedHashSet<Review> reviews;

    @Column(name = "user_name")
    private String username;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zipcode")
    private int zipcode;

    private boolean pnutAllerg;

    private boolean eggAllerg;

    private boolean dairyAllerg;


public User(String username){
    this.username = username;
}


}
