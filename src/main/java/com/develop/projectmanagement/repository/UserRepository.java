package com.develop.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.develop.projectmanagement.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
