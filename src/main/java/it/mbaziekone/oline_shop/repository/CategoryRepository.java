package it.mbaziekone.oline_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.oline_shop.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
