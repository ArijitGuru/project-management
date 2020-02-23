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

import com.develop.projectmanagement.model.ParentTask;
import com.develop.projectmanagement.service.ParentTaskService;

@RestController
public class ParentTaskController {
	
	@Autowired
	ParentTaskService parentTaskService;
	
	@PostMapping("/addParentTask")
	public ParentTask addParentTask(@RequestBody ParentTask pTask) {
		return  parentTaskService.addParentTask(pTask);
	}
	
	@GetMapping("/viewParentTask")
	public List<ParentTask> viewParentTask(){
		List<ParentTask> pTaskList = parentTaskService.viewParentTasks();
		return pTaskList;
	}
	
	@PutMapping("/editParentTask")
	public ParentTask esitParentTask(@RequestBody ParentTask pTask) {
		return  parentTaskService.editParentTask(pTask);
	}
	
	@DeleteMapping("/deleteParentTask/{id}")
	public void deleteParenTask(@PathVariable (value="id") int id) {
		parentTaskService.deleteParentTask(id);
	}

}
