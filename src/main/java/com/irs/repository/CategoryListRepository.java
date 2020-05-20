package com.irs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.irs.model.CategoryList;
import com.irs.model.Menu;


/**
 * Interface to access database- Submenu table
 */

@Transactional(readOnly = true)
public interface CategoryListRepository extends JpaRepository<CategoryList, Integer> {
	/**
	 * Get categoryList by menu id
	 * 
	 * @return CategoryList category list
	 */
	public List<CategoryList> findAllByMenuId(Menu menuId);

	/**
	 * Get category  by id 
	 * 
	 * @return CategoryList category 
	 **/
    public CategoryList findById(int id);

	/**
	 * Get category  by name 
	 * 
	 * @return CategoryList category 
	 **/
    public CategoryList findBySubMenuName(String name);
}
