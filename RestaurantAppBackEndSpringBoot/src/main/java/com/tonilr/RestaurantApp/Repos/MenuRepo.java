package com.tonilr.RestaurantApp.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonilr.RestaurantApp.Entities.Menu;

@Repository
public interface MenuRepo extends JpaRepository<Menu,Long>{

}
