package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order,String>{

}
