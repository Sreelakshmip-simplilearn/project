package com.example.demo.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

import ch.qos.logback.core.model.Model;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// fetchAll users
	// Http method : get
	// uri : /users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.fetchUserList();

	}

	@RequestMapping("/user-list")
	public List<User> userList(Model model) {
		List<User> users = userService.fetchUserList();
		model.addText("users");
		return users;
	}

	@GetMapping(path = "/users/{emailId}")
	public User getUser(@PathVariable String emailId) {
		User user = userService.getUser(emailId);

		if (user == null) {
			throw new RuntimeException("id null");
			
		}
		return user;
	}

	@PostMapping(path = "/users") 
	public ResponseEntity<User> createUser(@RequestBody User user) {

		
		System.out.println(user.getFirstName());

		User SaveUser = userService.saveUser(user);
		// response header : location
		// status code :201
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(SaveUser.getEmailId()).toUri();
		return ResponseEntity.created(location).build();

	}

	// PUT
	@PutMapping(value = "createUser")
	public User createUser2(@RequestBody User userDataInput) {
		return userService.saveUser(userDataInput);
	}

	// update

	@PutMapping(value = "/users/{emailId}")
	public void updateUser(@PathVariable String emailId, @RequestBody User userDataInput) {
		userService.updateUser(userDataInput);
	}

	@GetMapping("/goToViewPage")
	public ModelAndView passParametersWithModelAndView() {
		ModelAndView modelAndView = new ModelAndView("UserList");
		modelAndView.addObject("message", "test data");
		return modelAndView;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("message", "test data");

		return modelAndView;
	}
}