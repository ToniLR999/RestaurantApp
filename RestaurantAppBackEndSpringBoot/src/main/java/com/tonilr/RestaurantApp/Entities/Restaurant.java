package com.tonilr.RestaurantApp.Entities;

import java.sql.Date;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
public class Restaurant {
	
	@Id
    private String restaurant_id;

    private String name;
	
    private String address;

    private CuisineType cuisineType;
    
	private Date openingTime;
	
	private Date closeTime;
	
    private String phoneNumber;
	
    private Boolean isActive;
	
    @DBRef
    private Set<Menu> menus = new HashSet<Menu>();
    
    @DBRef
    private Set<Booking> bookings = new HashSet<Booking>();
	
	 public String getId() {
	        return restaurant_id;
	    }

	    public void setId(String restaurant_id) {
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
