package com.tonilr.RestaurantApp.Entities;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;


@Document(collection = "products")
public class Product {
	
	@Id
    private String product_id;

    private String name;
	
    private String description;

    private Double price;
	
    private Boolean isActive;
	
    @DBRef
    private Menu menu;
    
    @DBRef
    private Set<Review> reviews = new HashSet<Review>();

	
	 public String getId() {
	        return product_id;
	    }

	    public void setId(String product_id) {
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
