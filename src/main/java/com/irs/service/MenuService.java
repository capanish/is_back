package com.irs.service;

import java.util.List;

import com.irs.exception.ApiException;
import com.irs.model.Menu;

public interface MenuService {
	/**
	 * Get all menu items
	 * @return Menu menu list
	 *  @exception ApiException
	 *  
	 */
    List<Menu> findAll() throws ApiException;
    /**
	 * Get menu item by id 
	 * @return Menu menu
	 *  @exception ApiException
	 *  
	 **/
    Menu findById(int id) throws ApiException;
    /**
  	 * Get menu item by name 
  	 * @return Menu menu
  	 *  @exception ApiException
  	 *  
  	 **/
    Menu findByName(String name) throws ApiException;
    
}
