package com.restaurant.diningapi.repository;

import com.restaurant.diningapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.user.id")
    Set<User> findAllByUserId(Long userId);


    Optional<User> findById(Long userId);
}
