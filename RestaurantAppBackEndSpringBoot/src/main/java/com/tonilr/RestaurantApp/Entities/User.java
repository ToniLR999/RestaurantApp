package com.tonilr.RestaurantApp.Entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(nullable = false, updatable = false)
	    private Long user_id;

		@Column(nullable = false, updatable = true)
	    private String username;

		@Column(nullable = false, updatable = true)
	    private String password;

		@Column(nullable = false, updatable = true)
	    private String email;
	    
		@Column(nullable = false, updatable = true)
		private Date register_date;
		
		@Column(nullable = true, updatable = true)
	    private String address;
		
		@Column(nullable = true, updatable = true)
	    private String phoneNumber;
		
		@Column(nullable = false, updatable = true)
	    private Boolean isActive;

	    @Enumerated(EnumType.STRING)
		@Column(nullable = false, updatable = true)
	    private UserRole role;  // Example: ADMIN, USER
		
	    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	    private Set<Order> orders = new HashSet<Order>();
		
	    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	    private Set<Booking> bookings = new HashSet<Booking>();
		
	    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	    private Set<Review> reviews = new HashSet<Review>();
		
		 public Long getId() {
		        return user_id;
		    }

		    public void setId(Long user_id) {
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
