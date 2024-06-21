package it.mbaziekone.online_shop.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mbaziekone.online_shop.model.Category;
import it.mbaziekone.online_shop.service.CategoryService;

@RestController
@RequestMapping("api/categories")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryRestController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public List<Category> findAllCategories() {
		
		return categoryService.findAllCategories();
		
	}
}