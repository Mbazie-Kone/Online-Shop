package it.mbaziekone.oline_shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import it.mbaziekone.oline_shop.repository.ProductRepository;
import it.mbaziekone.oline_shop.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
}
