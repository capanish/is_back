package com.irs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irs.exception.ApiException;
import com.irs.model.Menu;
import com.irs.service.MenuService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Rest service for menu
 *
 */
@RestController
@RequestMapping("/apiInteractiveRetailStore/v1")
@Api(value = "Manage menu")
@CrossOrigin(origins = { "*" })
public class MenuRESTController {

	private static final Logger LOG = LoggerFactory.getLogger(MenuRESTController.class);

	@Autowired
	private MenuService menuService;

	@GetMapping("/menus")
	public ResponseEntity<List<Menu>> getAllMenuItems() throws ApiException {
		LOG.info("MenuRESTController : getAllMenuItems - Start");
		try {
			List<Menu> menus = menuService.findAll();
			return ResponseEntity.ok().body(menus);
		} catch (Exception e) {
			throw new ApiException("Exception in MenuRESTController : getAllMenuItems", e);
		}
	}

	@GetMapping(value = "/menus/{id}", produces = "application/json")
	@ApiOperation(value = "getMenuById", notes = "Returns menu from Menu")
	@ApiResponses({ @ApiResponse(code = 200, message = "OK", response = Menu.class),
			@ApiResponse(code = 500, message = "Internal error server") })
	public ResponseEntity<Menu> getMenuById(@PathVariable(value = "id") int menuId) throws ApiException {
		LOG.info("MenuRESTController : getMenuById - Start");
		try {
			Menu menu = menuService.findById(menuId);
			if (menu != null) {
				return ResponseEntity.ok().body(menu);
			} else {
				return ResponseEntity.noContent().build();
			}
		} catch (Exception e) {
			throw new ApiException("Exception in MenuRESTController : getMenuById", e);
		}
	}

}
