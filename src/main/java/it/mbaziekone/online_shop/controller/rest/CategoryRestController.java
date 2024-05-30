package it.mbaziekone.online_shop.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mbaziekone.online_shop.model.Category;
import it.mbaziekone.online_shop.service.CategoryService;

@RestController
@RequestMapping("api/products")
public class CategoryRestController {
	
	@Autowired
	private CategoryService categoryService;
	
	public List<Category> findAllCategories() {
		
		List<Category> categories = categoryService.findAllCategories();
		
		return categories;
		
	}

}
