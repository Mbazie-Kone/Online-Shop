package it.mbaziekone.online_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.online_shop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}