package it.mbaziekone.online_shop.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mbaziekone.online_shop.model.Product;
import it.mbaziekone.online_shop.service.ProductService;

@RestController
@RequestMapping("api/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	private final Logger log = LoggerFactory.getLogger(ProductRestController.class);
	
	@GetMapping
	public List<Product> products() {
		List<Product> products = productService.findAllProducts();
		return products;		
	}
}