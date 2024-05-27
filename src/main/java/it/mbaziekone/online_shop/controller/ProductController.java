package it.mbaziekone.online_shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.mbaziekone.online_shop.model.Product;
import it.mbaziekone.online_shop.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Product Page";
	}
	
	@GetMapping("/all")
	public List<Product> products() {
		List<Product> list = productService.findAll();
		return list;
	}
}
