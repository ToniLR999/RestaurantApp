package com.tonilr.RestaurantApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonilr.RestaurantApp.Entities.User;
import com.tonilr.RestaurantApp.Exceptions.NotFoundException;
import com.tonilr.RestaurantApp.Repos.UserRepo;

@Service
public class UserServices {
	
	@Autowired
	private final UserRepo userRepo;

	public UserServices(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public User addUser(User usuario) {
		return userRepo.save(usuario);
	}

	public List<User> findAllUsers() {
		return userRepo.findAll();
	}

	public User updateUser(User usuario) {
		return userRepo.save(usuario);
	}

	public User findUserById(String id) {
		return userRepo.findById(id)
				.orElseThrow(() -> new NotFoundException("User by id " + id + " was not found"));

	}

	public void deleteUser(String id) {
		userRepo.deleteById(id);
	}
}
