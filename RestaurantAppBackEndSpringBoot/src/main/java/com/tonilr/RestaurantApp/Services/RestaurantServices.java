package com.tonilr.RestaurantApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonilr.RestaurantApp.Entities.Restaurant;
import com.tonilr.RestaurantApp.Exceptions.NotFoundException;
import com.tonilr.RestaurantApp.Repos.RestaurantRepo;

@Service
public class RestaurantServices {

	@Autowired
	private final RestaurantRepo restaurantRepo;

	public RestaurantServices(RestaurantRepo restaurantRepo) {
		this.restaurantRepo = restaurantRepo;
	}

	public Restaurant addRestaurant(Restaurant restaurant) {
		return restaurantRepo.save(restaurant);
	}

	public List<Restaurant> findAllRestaurants() {
		return restaurantRepo.findAll();
	}

	public Restaurant updateRestaurant(Restaurant restaurant) {
		return restaurantRepo.save(restaurant);
	}

	public Restaurant findRestaurantById(Long id) {
		return restaurantRepo.findById(id)
				.orElseThrow(() -> new NotFoundException("Restaurant by id " + id + " was not found"));

	}

	public void deleteRestaurant(Long id) {
		restaurantRepo.deleteById(id);
	}
}
