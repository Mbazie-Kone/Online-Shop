package it.mbaziekone.oline_shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	
	private Long id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	private String 
}