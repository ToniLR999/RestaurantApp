package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Review;

@Repository
public interface ReviewRepo extends MongoRepository<Review,String>{

}
