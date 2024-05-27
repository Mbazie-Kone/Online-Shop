package it.mbaziekone.online_shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import it.mbaziekone.online_shop.repository.CategoryRepository;
import it.mbaziekone.online_shop.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

}
