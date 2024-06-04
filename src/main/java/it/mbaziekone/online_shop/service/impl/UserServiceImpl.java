package it.mbaziekone.online_shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mbaziekone.online_shop.model.security.User;
import it.mbaziekone.online_shop.repository.UserRepository;
import it.mbaziekone.online_shop.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}