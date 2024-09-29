package com.tonilr.RestaurantApp.Entities;


import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "menus")
public class Menu {

	@Id
    private String menu_id;

    private String name;

    private String description;

    private String image;
	
    private Boolean isActive;
	
    @DBRef
    private Restaurant restaurant;
    
    @DBRef
    private Set<Product> products = new HashSet<Product>();
    

	 public String getId() {
	        return menu_id;
	    }

	    public void setId(String menu_id) {
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
