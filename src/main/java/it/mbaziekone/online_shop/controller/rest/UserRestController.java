package it.mbaziekone.online_shop.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.mbaziekone.online_shop.model.security.User;
import it.mbaziekone.online_shop.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	public UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}