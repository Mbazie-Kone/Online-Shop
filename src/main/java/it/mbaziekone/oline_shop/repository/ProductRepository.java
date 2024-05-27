package it.mbaziekone.oline_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.oline_shop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}