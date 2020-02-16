package com.develop.projectmanagement.service;

import org.springframework.stereotype.Service;

import com.develop.projectmanagement.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String addUser(User user) {
		// TODO Call DAO
		return "User Added";
	}

	@Override
	public String editUser(User user) {
		// TODO Call DAO
		return "User updated";
	}

	@Override
	public User viewUser() {
		// TODO Call DAO
		User user = new User();
		user.setFirstName("Arijit");
		return user;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Call DAO
		return true;
	}

}
