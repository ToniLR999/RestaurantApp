package com.tonilr.RestaurantApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonilr.RestaurantApp.Entities.Menu;
import com.tonilr.RestaurantApp.Exceptions.NotFoundException;
import com.tonilr.RestaurantApp.Repos.MenuRepo;

@Service
public class MenuServices {

	@Autowired
	private final MenuRepo menuRepo;

	public MenuServices(MenuRepo menuRepo) {
		this.menuRepo = menuRepo;
	}

	public Menu addMenu(Menu menu) {
		return menuRepo.save(menu);
	}

	public List<Menu> findAllMenus() {
		return menuRepo.findAll();
	}

	public Menu updateMenu(Menu menu) {
		return menuRepo.save(menu);
	}

	public Menu findMenuById(Long id) {
		return menuRepo.findById(id)
				.orElseThrow(() -> new NotFoundException("Menu by id " + id + " was not found"));

	}

	public void deleteMenu(Long id) {
		menuRepo.deleteById(id);
	}
}
