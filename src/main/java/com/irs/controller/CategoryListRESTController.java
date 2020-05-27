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
import com.irs.model.CategoryList;
import com.irs.service.CategoryListService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Rest service for category list
 *
 */
@RestController
@RequestMapping("/apiInteractiveRetailStore/v1")
@Api(value = "Manage categoryList")
@CrossOrigin(origins = { "*" })
public class CategoryListRESTController {

	private static final Logger LOG = LoggerFactory.getLogger(CategoryListRESTController.class);

	@Autowired
	private CategoryListService categoryListService;

	@GetMapping(value="/categoryList/menu/{id}", produces = "application/json")
	public ResponseEntity<List<CategoryList>> getCategoryListByMenuId(@PathVariable(value = "id") int menuId)
			throws ApiException {
		LOG.info("CategoryMenuRESTController : getCategoryListByMenuId - Start");
		try {
			List<CategoryList> categoryList = categoryListService.findAllByMenuId(menuId);
			return ResponseEntity.ok().body(categoryList);
		} catch (Exception e) {
			throw new ApiException("Exception in CategoryListRESTController : getCategoryListByMenuId ", e);
		}
	}

	@GetMapping(value = "/categoryList/{id}", produces = "application/json")
	@ApiOperation(value = "getCategoryById", notes = "Returns category from categoryList")
	@ApiResponses({ @ApiResponse(code = 200, message = "OK", response = CategoryList.class),
			@ApiResponse(code = 204, message = "NO CONTENT"),
			@ApiResponse(code = 500, message = "Internal error server") })
	public ResponseEntity<CategoryList> getCategoryById(@PathVariable(value = "id") int subMenuId) throws ApiException {
		LOG.info("CategoryMenuRESTController : getCategoryById - Start");
		try {
			CategoryList categoryList = categoryListService.findById(subMenuId);
			if(categoryList!=null) {
	        	return ResponseEntity.ok().body(categoryList);
	        }else {
	        	return  ResponseEntity.noContent().build();
	        }
		} catch (Exception e) {
			throw new ApiException("Exception in CategoryListRESTController : getCategoryById ", e);
		}
	}

	@GetMapping(value = "/categoryList/name/{name}", produces = "application/json")
	@ApiOperation(value = "getCategoryByName", notes = "Returns category from categoryList")
	@ApiResponses({ @ApiResponse(code = 200, message = "OK", response = CategoryList.class),
			@ApiResponse(code = 204, message = "NO CONTENT"),
			@ApiResponse(code = 500, message = "Internal error server") })
	public ResponseEntity<CategoryList> getCategoryByName(@PathVariable(value = "name") String subMenuName) throws ApiException {
		LOG.info("CategoryMenuRESTController : getCategoryByName - Start");
		try {
			CategoryList categoryList = categoryListService.findBySubMenuName(subMenuName);
			if(categoryList!=null) {
	        	return ResponseEntity.ok().body(categoryList);
	        }else {
	        	return  ResponseEntity.noContent().build();
	        }
		} catch (Exception e) {
			throw new ApiException("Exception in CategoryListRESTController : getCategoryByName ", e);
		}
	}
}
