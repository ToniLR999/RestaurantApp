package com.tonilr.RestaurantApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonilr.RestaurantApp.Entities.Order;
import com.tonilr.RestaurantApp.Exceptions.NotFoundException;
import com.tonilr.RestaurantApp.Repos.OrderRepo;

@Service
public class OrderServices {

	@Autowired
	private final OrderRepo orderRepo;

	public OrderServices(OrderRepo orderRepo) {
		this.orderRepo = orderRepo;
	}

	public Order addOrder(Order order) {
		return orderRepo.save(order);
	}

	public List<Order> findAllOrders() {
		return orderRepo.findAll();
	}

	public Order updateOrder(Order order) {
		return orderRepo.save(order);
	}

	public Order findOrderById(String id) {
		return orderRepo.findById(id)
				.orElseThrow(() -> new NotFoundException("Order by id " + id + " was not found"));

	}

	public void deleteOrder(String id) {
		orderRepo.deleteById(id);
	}
}
