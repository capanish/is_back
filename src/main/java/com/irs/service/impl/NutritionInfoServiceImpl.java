package com.irs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irs.exception.ApiException;
import com.irs.model.CategoryList;
import com.irs.model.NutriInfo;
import com.irs.repository.NutriInfoRepository;
import com.irs.service.NutritionInfoService;

/**
 * Implementation of CategoryService interface
 * 
 */
@Service
public class NutritionInfoServiceImpl implements NutritionInfoService {
    
    @Autowired
    private NutriInfoRepository nutriInfoRepository;
    
    @Override
	public NutriInfo findBySubMenuId(int subMenuId) throws ApiException {
    	CategoryList subMenu = new CategoryList();
    	subMenu.setId(subMenuId);
		return nutriInfoRepository.findBySubMenuID(subMenu);
    }
		
    @Override
	public NutriInfo findById(int id) throws ApiException{
		return nutriInfoRepository.findById(id);
	}
   
    
   
    
}
