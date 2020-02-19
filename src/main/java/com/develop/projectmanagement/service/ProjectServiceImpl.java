package com.develop.projectmanagement.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.projectmanagement.model.Project;
import com.develop.projectmanagement.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public Project addProject(Project project) {
		
		return projectRepository.save(project);
	}

	@Override
	public Project editProject(Project project) {
		
		return projectRepository.save(project);
	}

	@Override
	public List<Project> viewProjects() {
		List<Project> projectList = new ArrayList<Project>();
		projectRepository.findAll().forEach(projectList::add);
		return projectList;
	}

	@Override
	public void deleteProject(int projectId) {
		projectRepository.deleteById(Integer.valueOf(projectId));
		
	}

	@Override
	public Project addProjectWithDates(Project project) {
		// TODO Auto-generated method stub
		//If start date is empty, set start date = today; endDate = tomorrow;
		Date startDate = new Date();
		Date endDate = new Date (startDate.getTime() + TimeUnit.DAYS.toMillis(1));
		
		project.setStartDate(startDate);
		project.setEndDate(endDate);
		Project updatedProject = projectRepository.save(project);
		return updatedProject;
	}

}
