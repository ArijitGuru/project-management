package com.develop.projectmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		User addedUser = userRepository.save(user);
		return addedUser;
	}

	@Override
	public User editUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public List<User> viewUser() {
		List<User> userList = new ArrayList<User>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}

	@Override
	public void deleteUser(int userId) {
		Integer id = Integer.valueOf(userId);
		//Optional<User> user = userRepository.findById(id);
		userRepository.deleteById(id);
		
	}

}
