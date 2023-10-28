package com.restaurant.diningapi.sevices;

import com.restaurant.diningapi.exceptions.UserNotFoundException;
import com.restaurant.diningapi.model.Review;
import com.restaurant.diningapi.model.User;
import com.restaurant.diningapi.repository.ReviewRepository;
import com.restaurant.diningapi.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    private ReviewRepository reviewRepository;

    public LinkedHashSet<Review> getUserReviews(Long userId){
        User user = userRepository.findById(userId).orElseThrow(() ->new UserNotFoundException(userId));

       return user.getReviews() ;
    }

    public User saveUserWithReview(User user){
        for(Review review : user.getReviews()){

        }
        return null;
    }

    public User getSingleUser(Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return user;
    }



}
