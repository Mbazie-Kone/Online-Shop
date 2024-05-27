package it.mbaziekone.online_shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mbaziekone.online_shop.model.Product;
import it.mbaziekone.online_shop.repository.ProductRepository;
import it.mbaziekone.online_shop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		List<Product> products = productRepository.findAll();
		return products;
	}
	
}
