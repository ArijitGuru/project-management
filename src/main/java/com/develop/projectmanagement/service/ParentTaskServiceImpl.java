package com.develop.projectmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.projectmanagement.model.ParentTask;
import com.develop.projectmanagement.repository.ParentTaskRepository;

@Service
public class ParentTaskServiceImpl implements ParentTaskService{

	@Autowired
	private ParentTaskRepository parentTaskRep;
	
	@Override
	public ParentTask addParentTask(ParentTask task) {
		return parentTaskRep.save(task);
	}

	@Override
	public ParentTask editParentTask(ParentTask task) {
		// TODO Auto-generated method stub
		return parentTaskRep.save(task);
	}

	@Override
	public List<ParentTask> viewParentTasks() {
		// TODO Auto-generated method stub
		List <ParentTask> parentTaskList = new ArrayList<ParentTask>();
		parentTaskRep.findAll().forEach(parentTaskList::add);
		return parentTaskList;
	}

	@Override
	public void deleteParentTask(int taskId) {
		// TODO Auto-generated method stub
		parentTaskRep.deleteById(taskId);
		
	}

}
