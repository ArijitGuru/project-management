package com.develop.projectmanagement.service;

import java.util.List;

import com.develop.projectmanagement.model.User;

public interface UserService {
	public User addUser (User user);
	public String editUser(User user);
	public List<User> viewUser();
	public boolean deleteUser(User user);
	
}
