package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Booking;

@Repository
public interface BookingRepo extends MongoRepository<Booking,String>{

}
