package com.example.apidemo.repositories;

import com.example.apidemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User getUserById(long id);
}
