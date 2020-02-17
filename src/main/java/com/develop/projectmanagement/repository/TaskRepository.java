package com.develop.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.develop.projectmanagement.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
