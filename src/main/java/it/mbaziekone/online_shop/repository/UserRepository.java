package it.mbaziekone.online_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.online_shop.model.security.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
}