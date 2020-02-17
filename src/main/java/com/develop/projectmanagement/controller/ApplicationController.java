package com.develop.projectmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.projectmanagement.model.User;
import com.develop.projectmanagement.service.UserService;


@RestController
@RequestMapping ("/projectmanagement") 
public class ApplicationController {
	
	@Autowired
	UserService userService;
	
	
	
		@GetMapping ("/test") // it is a short form of 
		//RequestMapping (value = "/notes", method=RequestMethod.GET)
		public List <String> test(){
			List<String> sampleData = new ArrayList<>();
			sampleData.add("Arijit");
			sampleData.add("Abhra");
			sampleData.add("Indranil");
			
			return sampleData; //
		}
		
		@GetMapping ("/viewUser") // it is a short form of 
		//RequestMapping (value = "/notes", method=RequestMethod.GET)
		public List<User> viewUser(){
			List<User> userList = userService.viewUser();
			
			return userList; 
		}
		
		@PostMapping ("/addUser") // it is a short form of 
		//RequestMapping (value = "/notes", method=RequestMethod.POST)
		public User addUser(@RequestBody User userParam){
			User user = userService.addUser(userParam);
			
			return user; 
		}

}
