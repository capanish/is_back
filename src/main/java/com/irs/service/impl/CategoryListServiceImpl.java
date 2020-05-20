package com.irs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irs.exception.ApiException;
import com.irs.model.CategoryList;
import com.irs.model.Menu;
import com.irs.repository.CategoryListRepository;
import com.irs.service.CategoryListService;

/**
 * Implementation of CategoryService interface
 * 
 */
@Service
public class CategoryListServiceImpl implements CategoryListService {
    
    @Autowired
    private CategoryListRepository categoryListRepository;
    
    @Override
	public List<CategoryList> findAllByMenuId(int menuId) throws ApiException {
    	Menu menu = new Menu();
    	menu.setId(menuId);
		return categoryListRepository.findAllByMenuId(menu);
	}
    @Override
	public CategoryList findById(int id) throws ApiException{
		return categoryListRepository.findById(id);
	}
    @Override
	public CategoryList findBySubMenuName(String name) throws ApiException{
		return categoryListRepository.findBySubMenuName(name);
	}
    
   
    
}
