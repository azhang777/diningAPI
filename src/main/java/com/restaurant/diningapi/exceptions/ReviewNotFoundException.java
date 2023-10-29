package com.restaurant.diningapi.exceptions;

public class ReviewNotFoundException extends RuntimeException{
    public ReviewNotFoundException() {
        System.out.println("Review not found.");
    }
}
