package com.project.shopapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.shopapp.models.*;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByPhoneNumber(String phoneNumber);
    Optional<User> findByPhoneNumber(String phoneNumber);
}

