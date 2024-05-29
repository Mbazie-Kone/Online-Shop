package it.mbaziekone.online_shop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	@Column(name = "stock_quantity")
	private int stockQuantity;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "average_rating")
	private double averageRating;
	
	@Column(name = "review_count")
	private int reviewCount;


}