package com.sayedbaladoh.userservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sayedbaladoh.userservice.service.UserService;

import com.sayedbaladoh.userservice.model.User;

/**
 * Recipients Controller
 * 
 * @author SayedBaladoh
 *
 */
@RestController
public class UserController {

	@Autowired
	 private Environment environment;
	
	@Autowired
	private UserService userService;

	@PostMapping
	public User add(@RequestBody User user) {
		System.out.println("User.server.port: " + environment.getProperty("local.server.port"));
		return userService.save(user);
	}

	@GetMapping
	public List<User> findAll() {
		System.out.println("User.server.port: " + environment.getProperty("local.server.port"));
		return userService.getAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id) {
		System.out.println("User.server.port: " + environment.getProperty("local.server.port"));
		Optional<User> user = userService.get(id);
		if (user.isPresent())
			return new ResponseEntity<>(user.get(), HttpStatus.OK);
		else
			return new ResponseEntity<>("User not found with id: " + id, HttpStatus.NOT_FOUND);
	}

	@GetMapping("/site/{siteId}")
	public List<User> findBySite(@PathVariable("siteId") Long siteId) {
		System.out.println("User.server.port: " + environment.getProperty("local.server.port"));
		return userService.getBySiteId(siteId);
	}

	@GetMapping("/organization/{organizationId}")
	public List<User> findByOrganization(@PathVariable("organizationId") Long organizationId) {
		System.out.println("User.server.port: " + environment.getProperty("local.server.port"));
		return userService.getByOrganizationId(organizationId);
	}

}
