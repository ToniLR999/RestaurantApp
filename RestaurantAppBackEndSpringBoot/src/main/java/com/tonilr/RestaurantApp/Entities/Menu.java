package com.tonilr.RestaurantApp.Entities;


import java.util.HashSet;
import java.util.Set;

import com.tonilr.CarsEcommerce.Entities.Order;

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
@Table(name = "menus")
public class Menu {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
    private Long menu_id;

	@Column(nullable = false, updatable = true)
    private String name;

	@Column(nullable = false, updatable = true)
    private String description;

	@Column(nullable = false, updatable = true)
    private String image;
	
	@Column(nullable = false, updatable = true)
    private Boolean isActive;
	
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Product> products = new HashSet<Product>();
    

	 public Long getId() {
	        return menu_id;
	    }

	    public void setId(Long menu_id) {
	        this.menu_id = menu_id;
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

	    public String getImage() {
	        return image;
	    }

	    public void setImage(String image) {
	        this.image = image;
	    }
	    
	    public Boolean getIsActive() {
	        return isActive;
	    }

	    public void setIsActive(Boolean isActive) {
	        this.isActive = isActive;
	    }
	    
	    public Restaurant getRestaurant() {
	        return restaurant;
	    }

	    public void setRestaurant(Restaurant restaurant) {
	        this.restaurant = restaurant;
	    }
	    

	    public Set<Product> getProducts() {
	        return products;
	    }

	    public void setProducts(Set<Product> products) {
	        this.products = products;
	    }
}
