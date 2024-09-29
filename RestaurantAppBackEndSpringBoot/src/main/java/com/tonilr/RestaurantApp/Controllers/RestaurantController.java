package com.tonilr.RestaurantApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tonilr.RestaurantApp.Entities.Restaurant;
import com.tonilr.RestaurantApp.Services.RestaurantServices;

@Controller
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	private final RestaurantServices restaurantService;
	
	public RestaurantController(RestaurantServices restaurantService) {
		this.restaurantService = restaurantService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Restaurant>> getAllRestaurants() {
		List<Restaurant> restaurants = restaurantService.findAllRestaurants();
		return new ResponseEntity<>(restaurants, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Restaurant> getRestaurantById(@PathVariable("id") String id) {
		Restaurant restaurant = restaurantService.findRestaurantById(id);
		return new ResponseEntity<>(restaurant, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
		Restaurant newRestaurant = restaurantService.addRestaurant(restaurant);
		return new ResponseEntity<>(newRestaurant, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Restaurant> updateRestaurant(@RequestBody Restaurant restaurant) {
		Restaurant updateRestaurant = restaurantService.updateRestaurant(restaurant);
		return new ResponseEntity<>(updateRestaurant, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteRestaurant(@PathVariable("id") String id) {
		restaurantService.deleteRestaurant(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
