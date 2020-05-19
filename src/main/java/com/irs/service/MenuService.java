package com.irs.service;

import java.util.List;

import com.irs.model.Menu;

public interface MenuService {
	/**
	 * Get all menu items
	 * 
	 * @return Menu menu list
	 */
    List<Menu> findAll();
    /**
	 * Get menu item by id 
	 * 
	 * @return Menu menu
	 **/
    Menu findById(int id);
    /**
  	 * Get menu item by name 
  	 * 
  	 * @return Menu menu
  	 **/
    Menu findByName(String name);
    
}
