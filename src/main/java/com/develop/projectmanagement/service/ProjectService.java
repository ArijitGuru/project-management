package com.develop.projectmanagement.service;

import java.util.List;

import com.develop.projectmanagement.model.Project;

public interface ProjectService {

	public Project addProject(Project project);
	public Project editProject(Project project);
	public List<Project> viewProjects();
	public void deleteProject(int projectId);
}
