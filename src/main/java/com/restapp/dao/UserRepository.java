package com.restapp.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.restapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
