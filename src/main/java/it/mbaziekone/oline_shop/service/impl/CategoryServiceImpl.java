package it.mbaziekone.oline_shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import it.mbaziekone.oline_shop.repository.CategoryRepository;
import it.mbaziekone.oline_shop.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

}
