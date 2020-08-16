package com.develop.projectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.develop.projectmanagement.model.Project;
import com.develop.projectmanagement.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService;

	// Project add/edit/delete

	@PostMapping("/addProject")
	public Project addProject(@RequestBody Project project) {
		System.out.println(project.toString());
		Project addedProject = projectService.addProject(project);
		return viewProject().get(0);
	}

	@PostMapping("/addProjectWithDefaultDate")
	public Project addProjectWithDefaultDate(@RequestBody Project project) {
		return projectService.addProjectWithDates(project);
	}

	@GetMapping("/viewProject")
	public List<Project> viewProject() {
		List<Project> projectList = projectService.viewProjects();
		return projectList;
	}

	@PutMapping("/editProject")
	public Project editProject(@RequestBody Project project) {
		Project addedProject = projectService.editProject(project);
		return addedProject;
	}

	@DeleteMapping("/deleteProject/{projectId}")
	public void deleteProject(@PathVariable(name = "projectId") int projectId) {
		projectService.deleteProject(projectId);
	}
}
