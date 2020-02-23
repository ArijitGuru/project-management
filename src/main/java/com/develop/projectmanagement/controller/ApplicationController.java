package com.develop.projectmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.projectmanagement.model.Project;
import com.develop.projectmanagement.model.Task;
import com.develop.projectmanagement.model.User;
import com.develop.projectmanagement.service.ProjectService;
import com.develop.projectmanagement.service.TaskService;
import com.develop.projectmanagement.service.UserService;


@RestController
@RequestMapping ("/projectmanagement") 
public class ApplicationController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	TaskService taskService;
	
	
		@GetMapping ("/test") // it is a short form of 
		//RequestMapping (value = "/test", method=RequestMethod.GET)
		public List <String> test(){
			List<String> sampleData = new ArrayList<>();
			sampleData.add("Arijit");
			sampleData.add("Abhra");
			sampleData.add("Indranil");
			
			return sampleData; //
		}
		
		//User Add/edit/view/delete
		
		@GetMapping ("/viewUser") // it is a short form of 
		//RequestMapping (value = "/viewUser", method=RequestMethod.GET)
		public List<User> viewUser(){
			List<User> userList = userService.viewUser();
			
			return userList; 
		}
		
		@PostMapping ("/addUser") // it is a short form of 
		//RequestMapping (value = "/addUser", method=RequestMethod.POST)
		public User addUser(@RequestBody User userParam){
			User user = userService.addUser(userParam);
			
			return user; 
		}
		
		@PutMapping ("/editUser") // it is a short form of 
		//RequestMapping (value = "/editUser", method=RequestMethod.PUT)
		public User editUser(@RequestBody User userParam){
			User user = userService.editUser(userParam);
			
			return user; 
		}
		
		@DeleteMapping ("/deleteUser/{id}") // it is a short form of 
		//RequestMapping (value = "/deleteUser/{id}", method=RequestMethod.Delete)
		public void deleteUser(@PathVariable (value="id") int id){
			userService.deleteUser(id);
			
			 
		}

		//Project add/edit/delete
		
		@PostMapping("/addProject")
		public Project addProject(@RequestBody Project project) {
			Project addedProject = projectService.addProject(project);
			return addedProject;
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
		public void deleteProject(@PathVariable (name="projectId") int projectId) {
			projectService.deleteProject(projectId);
		}
		
		
		//Task Add/edit/delete
		
		@PostMapping("/addTask")
		public Task addTask(@RequestBody Task task) {
			Task addedTask = taskService.addTask(task);
			return addedTask;
		}
		
		@GetMapping("/viewTask")
		public List<Task> viewTask() {
			List<Task> taskList = taskService.viewTasks();
			return taskList;
		}
		
		@PutMapping("/editTask")
		public Task editTask(@RequestBody Task task) {
			Task addedTask = taskService.editTask(task);
			return addedTask;
		}
		
		@DeleteMapping("/deleteTask/{taskId}")
		public void deleteTask(@PathVariable (name="taskId") int taskId) {
			taskService.deleteTask(taskId);
		}
		
		
}
