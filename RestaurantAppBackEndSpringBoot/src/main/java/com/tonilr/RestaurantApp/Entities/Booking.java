package com.tonilr.RestaurantApp.Entities;

import java.sql.Date;
import java.time.LocalDateTime;

import com.tonilr.CarsEcommerce.Entities.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
    private Long booking_id;

	@Column(nullable = false, updatable = true)
    private LocalDateTime reservationDate;
	
	@Column(nullable = true, updatable = true)
    private Integer numPeople;
    
	@Column(nullable = false, updatable = true)
	private BookingStatus status;
	
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;
	
	 public Long getId() {
	        return booking_id;
	    }

	    public void setId(Long booking_id) {
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
	        this.user = restaurant;
	    }

}
