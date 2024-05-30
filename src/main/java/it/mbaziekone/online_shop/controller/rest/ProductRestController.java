package it.mbaziekone.online_shop.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mbaziekone.online_shop.model.Product;
import it.mbaziekone.online_shop.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> products() {
		
		return productService.findAllProducts();
		
	}
}