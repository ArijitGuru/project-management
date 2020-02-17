package com.develop.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.develop.projectmanagement.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
