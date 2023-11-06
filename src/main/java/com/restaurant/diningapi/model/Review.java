package com.restaurant.diningapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Table(name = "review")
@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "restaurantId", nullable = false)
    private Long restaurantId;
    @Column (name = "peanut_score")
    private int peanutScore;
    @Column (name = "egg_score")
    private int eggScore;
    @Column (name = "dairy_score")
    private int diaryScore;
    @Column (name = "comment")
    private String comment;

    private AdminReviewAction adminReviewAction;
}
