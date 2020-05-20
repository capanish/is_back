package com.irs.service;

import java.util.List;

import com.irs.exception.ApiException;
import com.irs.model.CategoryList;

public interface CategoryListService {
	/**
	 * Get categoryList by menu id
	 * @return CategoryList category list
	 * @exception ApiException
	 * 
	 */
	public List<CategoryList> findAllByMenuId(int menuId) throws ApiException;
	
	/**
	 * Get category  by id 
	 * @return CategoryList category 
	 *  @exception ApiException
	 *  
	 **/
	public CategoryList findById(int subMenuId) throws ApiException;
	
	/**
	 * Get category  by name 
	 * @return CategoryList category 
	 * @exception ApiException
	 *  
	 **/
	public CategoryList findBySubMenuName(String subMenuName) throws ApiException;
    
    
}
