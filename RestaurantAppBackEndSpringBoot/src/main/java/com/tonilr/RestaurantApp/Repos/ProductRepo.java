package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long>{

}
