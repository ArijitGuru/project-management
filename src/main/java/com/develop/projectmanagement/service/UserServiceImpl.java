package com.develop.projectmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.projectmanagement.model.User;
import com.develop.projectmanagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		// TODO Call DAO
		User addedUser = userRepository.save(user);
		return addedUser;
	}

	@Override
	public String editUser(User user) {
		// TODO Call DAO
		return "User updated";
	}

	@Override
	public List<User> viewUser() {
		// TODO Call DAO
		List<User> userList = new ArrayList<User>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Call DAO
		return true;
	}

}
