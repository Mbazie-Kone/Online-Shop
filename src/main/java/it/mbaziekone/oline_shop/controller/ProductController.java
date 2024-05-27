package it.mbaziekone.oline_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.mbaziekone.oline_shop.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		
		return "Hello World";
	}
}