package com.tonilr.RestaurantApp.Entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")  // Definición de la colección
public class User {
	
		@Id
	    private String user_id;

	    private String username;

	    private String password;

	    private String email;
	    
		private Date register_date;
		
	    private String address;
		
	    private String phoneNumber;
		
	    private Boolean isActive;

	    @DBRef
	    private UserRole role;  // Example: ADMIN, USER
		
	    @DBRef
	    private Set<Order> orders = new HashSet<Order>();
		
	    @DBRef
	    private Set<Booking> bookings = new HashSet<Booking>();
		
	    @DBRef
	    private Set<Review> reviews = new HashSet<Review>();
		
		 public String getId() {
		        return user_id;
		    }

		    public void setId(String user_id) {
		        this.user_id = user_id;
		    }

		    public String getUsername() {
		        return username;
		    }

		    public void setUsername(String username) {
		        this.username = username;
		    }

		    public String getPassword() {
		        return password;
		    }

		    public void setPassword(String password) {
		        this.password = password;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public void setEmail(String email) {
		        this.email = email;
		    }
		    
			public Date getRegisterDate() {
				return register_date;
			}

			public void setRegisterDate(Date register_date) {
				this.register_date = register_date;
			}

		    public String getPhoneNumber() {
		        return phoneNumber;
		    }
		    
		    public void setPhoneNumber(String phoneNumber) {
		        this.phoneNumber = phoneNumber;
		    }
		    
		    
		    public String getAddress() {
		        return address;
		    }
		    

		    public void setAddress(String address) {
		        this.address = address;
		    }
		    
		    public Boolean getIsActive() {
		        return isActive;
		    }

		    public void setIsActive(Boolean isActive) {
		        this.isActive = isActive;
		    }		

		    public Set<Order> getOrders() {
		        return orders;
		    }

		    public void setOrders(Set<Order> orders) {
		        this.orders = orders;
		    }	
		    
		    
		    public Set<Booking> getBookings() {
		        return bookings;
		    }

		    public void setBookings(Set<Booking> bookings) {
		        this.bookings = bookings;
		    }		
		
		    public Set<Review> getReviews() {
		        return reviews;
		    }

		    public void setReviews(Set<Review> reviews) {
		        this.reviews = reviews;
		    }		
		
		
}
