package com.sam.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.demo.models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {
    
}
