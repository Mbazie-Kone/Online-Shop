package it.mbaziekone.online_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.online_shop.model.security.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	public Role findByName(String name);

}