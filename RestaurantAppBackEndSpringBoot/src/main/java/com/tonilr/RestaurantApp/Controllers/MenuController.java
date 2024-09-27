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

import com.tonilr.RestaurantApp.Entities.Menu;
import com.tonilr.RestaurantApp.Services.MenuServices;

@Controller
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private final MenuServices menuService;
	
	public MenuController(MenuServices menuService) {
		this.menuService = menuService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Menu>> getAllMenus() {
		List<Menu> menus = menuService.findAllMenus();
		return new ResponseEntity<>(menus, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Menu> getMenuById(@PathVariable("id") Long id) {
		Menu cart = menuService.findMenuById(id);
		return new ResponseEntity<>(cart, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Menu> addMenu(@RequestBody Menu menu) {
		Menu newMenu = menuService.addMenu(menu);
		return new ResponseEntity<>(newMenu, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Menu> updateMenu(@RequestBody Menu menu) {
		Menu updateMenu = menuService.updateMenu(menu);
		return new ResponseEntity<>(updateMenu, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteMenu(@PathVariable("id") Long id) {
		menuService.deleteMenu(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
