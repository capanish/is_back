package com.irs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irs.exception.ApiException;
import com.irs.model.Menu;
import com.irs.repository.MenuRepository;
import com.irs.service.MenuService;

/**
 * Implementation of MenuService interface
 * 
 */
@Service
public class MenuServiceImpl implements MenuService {
    
    @Autowired
    private MenuRepository menuRepository;
    
    @Override
	public List<Menu> findAll() throws ApiException{
		return menuRepository.findAll();
	}
    @Override
	public Menu findById(int id) throws ApiException{
		return menuRepository.findById(id);
	}
    @Override
	public Menu findByName(String name) throws ApiException{
		return menuRepository.findByMenuName(name);
	}
    
   
    
}
