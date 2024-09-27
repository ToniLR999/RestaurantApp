package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long>{

}
