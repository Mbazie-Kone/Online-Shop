package it.mbaziekone.online_shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import it.mbaziekone.online_shop.repository.ProductRepository;
import it.mbaziekone.online_shop.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
}
