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

import com.develop.projectmanagement.model.Task;
import com.develop.projectmanagement.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	TaskService taskService;

	// Task Add/edit/delete

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
	public void deleteTask(@PathVariable(name = "taskId") int taskId) {
		taskService.deleteTask(taskId);
	}
}
