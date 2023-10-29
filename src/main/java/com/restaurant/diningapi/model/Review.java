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
    private Long reviewId;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private long restuarantId;
    @Column (name = "peanut_score")
    private int peanutScore;
    @Column (name = "egg_score")
    private int eggScore;
    @Column (name = "dairy_score")
    private int diaryScore;
    @Column (name = "comment", nullable = false)
    private String comment;
}
