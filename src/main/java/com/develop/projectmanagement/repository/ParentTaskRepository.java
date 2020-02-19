package com.develop.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.develop.projectmanagement.model.ParentTask;

public interface ParentTaskRepository extends JpaRepository<ParentTask, Integer>{

}
