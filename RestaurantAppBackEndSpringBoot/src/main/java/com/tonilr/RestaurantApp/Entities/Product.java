package com.tonilr.RestaurantApp.Entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
    private Long product_id;

	@Column(nullable = false, updatable = true)
    private String name;
	
	@Column(nullable = true, updatable = true)
    private String description;

	@Column(nullable = true, updatable = true)
    private Double price;
	
	@Column(nullable = false, updatable = true)
    private Boolean isActive;
	
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Review> reviews = new HashSet<Review>();

	
	 public Long getId() {
	        return product_id;
	    }

	    public void setId(Long product_id) {
	        this.product_id = product_id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public String getDescription() {
	        return description;
	    }
	    
	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public Double getPrice() {
	        return price;
	    }
	    
	    public void setPrice(Double price) {
	        this.price = price;
	    }
	    

	    public Boolean getIsActive() {
	        return isActive;
	    }

	    public void setIsActive(Boolean isActive) {
	        this.isActive = isActive;
	    }	
	    
	    public Menu getMenu() {
	        return menu;
	    }

	    public void setMenu(Menu menu) {
	        this.menu = menu;
	    }
	    
	    public Set<Review> getReview() {
	        return reviews;
	    }

	    public void setReview(Set<Review> reviews) {
	        this.reviews = reviews;
	    }

}
