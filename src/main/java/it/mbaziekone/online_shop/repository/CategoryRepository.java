package it.mbaziekone.online_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.online_shop.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
