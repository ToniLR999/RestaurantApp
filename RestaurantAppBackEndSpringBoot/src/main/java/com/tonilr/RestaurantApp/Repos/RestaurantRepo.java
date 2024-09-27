package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Restaurant;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Long>{

}
