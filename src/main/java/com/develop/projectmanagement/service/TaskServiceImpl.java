package com.develop.projectmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.projectmanagement.model.Task;
import com.develop.projectmanagement.repository.TaskRepository;


@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public Task addTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}

	@Override
	public Task editTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}

	@Override
	public List<Task> viewTasks() {
		// TODO Auto-generated method stub
		List<Task> taskList = new ArrayList<Task>();
		taskRepository.findAll().forEach(taskList::add);
		return taskList;
	}

	@Override
	public void deleteTask(int taskId) {
		// TODO Auto-generated method stub
		taskRepository.deleteById(taskId);
		
	}

}
