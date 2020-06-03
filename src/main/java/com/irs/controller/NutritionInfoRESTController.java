package com.irs.controller;

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
import com.irs.model.NutriInfo;
import com.irs.service.NutritionInfoService;

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
public class NutritionInfoRESTController {

	private static final Logger LOG = LoggerFactory.getLogger(NutritionInfoRESTController.class);

	@Autowired
	private NutritionInfoService nutritionInfoService;

	@GetMapping(value="/nutriInfo/submenu/{id}", produces = "application/json")
	public ResponseEntity<NutriInfo> getNutriInfoBySubMenuId(@PathVariable(value = "id") int subMenuId)
			throws ApiException {
		LOG.info("NutritionInfoRESTController : getNutriInfoBySubMenuId - Start");
		try {
			NutriInfo nutriInfo = nutritionInfoService.findBySubMenuId(subMenuId);
			return ResponseEntity.ok().body(nutriInfo);
		} catch (Exception e) {
			throw new ApiException("Exception in NutritionInfoRESTController : getNutriInfoBySubMenuId ", e);
		}
	}

	@GetMapping(value = "/nutriInfo/{id}", produces = "application/json")
	@ApiOperation(value = "getNutriInfoById", notes = "Returns nutrition info from nutriInfo")
	@ApiResponses({ @ApiResponse(code = 200, message = "OK", response = NutriInfo.class),
			@ApiResponse(code = 204, message = "NO CONTENT"),
			@ApiResponse(code = 500, message = "Internal error server") })
	public ResponseEntity<NutriInfo> getNutriInfoById(@PathVariable(value = "id") int nutriId) throws ApiException {
		LOG.info("NutritionInfoRESTController : getNutriInfoById - Start");
		try {
			NutriInfo nutriInfo = nutritionInfoService.findById(nutriId);
			if(nutriInfo!=null) {
	        	return ResponseEntity.ok().body(nutriInfo);
	        }else {
	        	return  ResponseEntity.noContent().build();
	        }
		} catch (Exception e) {
			throw new ApiException("Exception in NutritionInfoRESTController : getNutriInfoById ", e);
		}
	}

}
