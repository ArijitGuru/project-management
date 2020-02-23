package com.develop.projectmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping ("/projectmanagement") // commenting it out as I have added a system property in main().
public class ApplicationController {

	@GetMapping("/test") // it is a short form of
	// RequestMapping (value = "/test", method=RequestMethod.GET)
	public List<String> test() {
		List<String> sampleData = new ArrayList<>();
		sampleData.add("Arijit");
		sampleData.add("Abhra");
		sampleData.add("Indranil");

		return sampleData; //
	}

}
