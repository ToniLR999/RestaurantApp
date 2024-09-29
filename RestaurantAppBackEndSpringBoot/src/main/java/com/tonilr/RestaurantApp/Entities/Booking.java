package com.tonilr.RestaurantApp.Entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "bookings")
public class Booking {
	
	@Id
    private String booking_id;

    private LocalDateTime reservationDate;
	
    private Integer numPeople;
    
	private BookingStatus status;
	
	@DBRef
    private User user;
    
	@DBRef
    private Restaurant restaurant;
	
	 public String getId() {
	        return booking_id;
	    }

	    public void setId(String booking_id) {
	        this.booking_id = booking_id;
	    }

	    public LocalDateTime getReservationDate() {
	        return reservationDate;
	    }

	    public void setReservationDate(LocalDateTime reservationDate) {
	        this.reservationDate = reservationDate;
	    }
	    
		public Integer getNumPeople() {
			return numPeople;
		}

		public void setNumPeople(Integer numPeople) {
			this.numPeople = numPeople;
		}
		
		public BookingStatus getStatus() {
			return status;
		}

		public void setStatus(BookingStatus status) {
			this.status = status;
		}
		
	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }
	    
	    public Restaurant getRestaurant() {
	        return restaurant;
	    }
	    
	    public void setRestaurant(Restaurant restaurant) {
	        this.restaurant = restaurant;
	    }

}
