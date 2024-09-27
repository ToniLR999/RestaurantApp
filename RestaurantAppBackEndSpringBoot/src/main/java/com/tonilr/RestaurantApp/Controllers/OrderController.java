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

import com.tonilr.RestaurantApp.Entities.Order;
import com.tonilr.RestaurantApp.Services.OrderServices;

@Controller
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private final OrderServices orderService;
	
	public OrderController(OrderServices orderService) {
		this.orderService = orderService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Order>> getAllCarts() {
		List<Order> orders = orderService.findAllOrders();
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable("id") Long id) {
		Order cart = orderService.findOrderById(id);
		return new ResponseEntity<>(cart, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		Order newOrder = orderService.addOrder(order);
		return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order) {
		Order updateOrder = orderService.updateOrder(order);
		return new ResponseEntity<>(updateOrder, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteOrder(@PathVariable("id") Long id) {
		orderService.deleteOrder(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
