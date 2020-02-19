package com.develop.projectmanagement.service;

import java.util.List;

import com.develop.projectmanagement.model.Task;

public interface TaskService {
	public Task addTask(Task task);
	public Task editTask(Task task);
	public List<Task> viewTasks();
	public void deleteTask(int taskId);
}
