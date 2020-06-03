package com.irs.service;

import com.irs.exception.ApiException;
import com.irs.model.NutriInfo;

public interface NutritionInfoService {

	
	/**
	 * Get nutri Info by  sub menu id
	 * @return CategoryList category list
	 * @exception ApiException
	 * 
	 */
	public NutriInfo findBySubMenuId(int subMenuId) throws ApiException;

	/**
	 * Get nutri info  by id 
	 * @return NutriInfo nutri info 
	 * @exception ApiException
	 * 
	 **/
    public NutriInfo findById(int id) throws ApiException;
	
}
