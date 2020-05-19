package com.irs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.irs.model.Menu;


/**
 * Interface to access database
 */

@Transactional(readOnly = true)
public interface MenuRepository extends JpaRepository<Menu, Integer> {

	/**
	 * Get all menu items
	 * 
	 * @return Menu menu list
	 */
	public List<Menu> findAll();

	/**
	 * Get menu item by id 
	 * 
	 * @return Menu menu
	 **/
    public Menu findById(int id);

    /**
	 * Get menu item by name 
	 * 
	 * @return Menu menu
	 **/
    public Menu findByMenuName(String name);

}
