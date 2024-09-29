package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Menu;

@Repository
public interface MenuRepo extends MongoRepository<Menu,String>{

}
