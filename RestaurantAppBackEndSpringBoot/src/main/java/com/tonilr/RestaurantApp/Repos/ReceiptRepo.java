package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Receipt;

@Repository
public interface ReceiptRepo extends MongoRepository<Receipt,String> {

}
