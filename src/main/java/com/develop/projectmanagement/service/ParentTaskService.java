package com.develop.projectmanagement.service;

import java.util.List;

import com.develop.projectmanagement.model.ParentTask;

public interface ParentTaskService {
	public ParentTask addParentTask(ParentTask task);
	public ParentTask editParentTask(ParentTask task);
	public List<ParentTask> viewParentTasks();
	public void deleteParentTask(int taskId);
}
