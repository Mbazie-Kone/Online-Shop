package it.mbaziekone.online_shop.service;

import java.util.List;

import it.mbaziekone.online_shop.model.security.User;

public interface UserService {
	
	public List<User> getAllUsers();
	
	public User saveUser(User user);
}
