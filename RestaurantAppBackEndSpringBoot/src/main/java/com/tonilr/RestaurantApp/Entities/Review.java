package com.tonilr.RestaurantApp.Entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")  // Definición de la colección
public class Review {
	
	@Id
    private String review_id;

    private String text;
	
    private Integer  rating;

    private LocalDateTime date;
	
    @DBRef
    private User user;
    
    @DBRef
    private Product product;
	
	 public String getId() {
	        return review_id;
	    }

	    public void setId(String review_id) {
	        this.review_id = review_id;
	    }

	    public String getText() {
	        return text;
	    }

	    public void setText(String text) {
	        this.text = text;
	    }

	    public Integer getRating() {
	        return rating;
	    }

	    public void setRating(Integer rating) {
	        this.rating = rating;
	    }
	    
		public LocalDateTime getDate() {
			return date;
		}

		public void setDate(LocalDateTime date) {
			this.date = date;
		}
		
	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }
	    
	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }
}
