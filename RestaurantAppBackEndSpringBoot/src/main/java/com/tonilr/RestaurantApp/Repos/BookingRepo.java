package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Long>{

}
