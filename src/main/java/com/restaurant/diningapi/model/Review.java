package com.restaurant.diningapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue
    private long reviewId;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private long restuarantId;
    @Column
    private int peanutScore;
    @Column
    private int eggScore;
    @Column
    private int diaryScore;
    @Column
    private String comment;
}
