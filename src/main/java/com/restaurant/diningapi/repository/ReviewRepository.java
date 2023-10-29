package com.restaurant.diningapi.repository;

import com.restaurant.diningapi.model.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
