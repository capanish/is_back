package com.irs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irs.model.CategoryList;
import com.irs.model.NutriInfo;

public interface NutriInfoRepository extends JpaRepository<NutriInfo, Integer> {
	/**
	 * Get nutri Info by  sub menu id
	 * 
	 * @return NutriInfo nutri Info list
	 */
	public NutriInfo findBySubMenuID(CategoryList subMenuID);

	/**
	 * Get nutri info  by id 
	 * 
	 * @return NutriInfo nutri info 
	 **/
    public NutriInfo findById(int id);
}
