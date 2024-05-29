package it.mbaziekone.online_shop.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Product> products;
	
	public Category() {}
	
	public Category(String name) {
		this.name = name;
	}

}
