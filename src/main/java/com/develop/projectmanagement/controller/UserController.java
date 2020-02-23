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

import com.develop.projectmanagement.model.User;
import com.develop.projectmanagement.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	// User Add/edit/view/delete

	@GetMapping("/viewUser") // it is a short form of
	// RequestMapping (value = "/viewUser", method=RequestMethod.GET)
	public List<User> viewUser() {
		List<User> userList = userService.viewUser();

		return userList;
	}

	@PostMapping("/addUser") // it is a short form of
	// RequestMapping (value = "/addUser", method=RequestMethod.POST)
	public User addUser(@RequestBody User userParam) {
		User user = userService.addUser(userParam);

		return user;
	}

	@PutMapping("/editUser") // it is a short form of
	// RequestMapping (value = "/editUser", method=RequestMethod.PUT)
	public User editUser(@RequestBody User userParam) {
		User user = userService.editUser(userParam);

		return user;
	}

	@DeleteMapping("/deleteUser/{id}") // it is a short form of
	// RequestMapping (value = "/deleteUser/{id}", method=RequestMethod.Delete)
	public void deleteUser(@PathVariable(value = "id") int id) {
		userService.deleteUser(id);

	}
}
