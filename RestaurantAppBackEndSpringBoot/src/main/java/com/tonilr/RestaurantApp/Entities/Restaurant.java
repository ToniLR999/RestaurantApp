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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurant {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
    private Long restaurant_id;

	@Column(nullable = false, updatable = true)
    private String name;
	
	@Column(nullable = true, updatable = true)
    private String address;

	@Column(nullable = false, updatable = true)
    private CuisineType cuisineType;
    
	@Column(nullable = false, updatable = true)
	private Date openingTime;
	
	@Column(nullable = false, updatable = true)
	private Date closeTime;
	
	@Column(nullable = true, updatable = true)
    private String phoneNumber;
	
	@Column(nullable = false, updatable = true)
    private Boolean isActive;
	
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Menu> menus = new HashSet<Menu>();
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Booking> bookings = new HashSet<Booking>();
	
	 public Long getId() {
	        return restaurant_id;
	    }

	    public void setId(Long restaurant_id) {
	        this.restaurant_id = restaurant_id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public CuisineType getCuisineType() {
	        return cuisineType;
	    }

	    public void setCuisineType(CuisineType cuisineType) {
	        this.cuisineType = cuisineType;
	    }
	    
		public Date getOpeningTime() {
			return openingTime;
		}

		public void setOpeningTime(Date openingTime) {
			this.openingTime = openingTime;
		}
		
		public Date getCloseTime() {
			return closeTime;
		}

		public void setCloseTime(Date closeTime) {
			this.closeTime = closeTime;
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

	    public Set<Menu> getMenu() {
	        return menus;
	    }

	    public void setMenu(Set<Menu> menus) {
	        this.menus = menus;
	    }
	    
	    public Set<Booking> getBooking() {
	        return bookings;
	    }

	    public void setBooking(Set<Booking> bookings) {
	        this.bookings = bookings;
	    }
}
