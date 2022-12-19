package com.springboot.rest.webservices.restfulwebservices.Assignments;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private UserDataStoring service;
	 public UserController(UserDataStoring service) {
		 this.service = service;
	 }

	 @GetMapping("/userdata")
	 public List<UserDetails> result() {

		 return service.findAll();
	 }

	 @GetMapping("/userdata/{zipcode}")
	 public UserDetails resultOne(@PathVariable int zipcode)
	 {

		 return service.findOne(zipcode);
	 }
}
