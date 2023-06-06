package com.thakurbrothers.springbootexceptionhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thakurbrothers.springbootexceptionhandling.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
