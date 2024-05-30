package it.mbaziekone.online_shop.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mbaziekone.online_shop.model.Product;
import it.mbaziekone.online_shop.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	public List<Product> products() {
		
		List<Product> products = productService.findAllProducts();
		
		return products;
	}

}
