package com.restaurant.diningapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

/*

A restaurant will have a set of review scores based on those submitted by users. On a scale of 1 to 5,
with 5 being the best, a restaurant will have individual scores for the following food allergies:
 */

@RequiredArgsConstructor
@Table(name = "restaurant")
@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    //A restaurant will have a set of review scores based on those submitted by users.

    @Column(name="name", nullable = false)
    private String name;
    @Column(name="address", nullable = false)
    private String address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    private Set<Review> reviews;
    @Column(name = "avg_review")
    private double avgReview;
    //A restaurant will also have an overall score, which will be the average across all the submitted scores across all the categories.

    //A user can later search for restaurants based on these scores.
}
