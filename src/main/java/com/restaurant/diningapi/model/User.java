package com.restaurant.diningapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.LinkedHashSet;

@RequiredArgsConstructor
@Table(name = "user")
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
    @Column(name = "nut_allergy")
    private boolean nutAllergy;
    @Column(name = "egg_allergy")
    private boolean eggAllergy;
    @Column(name = "dairy_allergy")
    private boolean dairyAllergy;
}
