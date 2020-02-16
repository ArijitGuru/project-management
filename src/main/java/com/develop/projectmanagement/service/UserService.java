package com.develop.projectmanagement.service;

import com.develop.projectmanagement.model.User;

public interface UserService {
	public String addUser (User user);
	public String editUser(User user);
	public User viewUser();
	public boolean deleteUser(User user);
	
}
