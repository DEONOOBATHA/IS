package com.bottleSell.api.repository;

import com.bottleSell.api.models.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User getUserById(Integer id);
}
