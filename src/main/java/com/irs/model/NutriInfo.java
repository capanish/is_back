package com.irs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "INFORMATION")
public class NutriInfo implements Serializable{


	private static final long serialVersionUID = -4048572595148505336L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INFO_ID")
	private int id;
    
    @OneToOne
    @JoinColumn(name = "FK_SUB_MENU_ID", referencedColumnName = "SUB_MENU_ID")
    private CategoryList subMenuID;
    
    @Column(length = 100)
    private String name;
   
    @Column(length = 1000)
    private String image;
    

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	public int getId() {
		return id;
	}
	/**
	 * @param id new value of {@link getId}
	 **/
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Get subMenuID
	 * 
	 * @return subMenuID
	 **/
	public CategoryList getSubMenuID() {
		return subMenuID;
	}
	/**
	 * @param subMenuID new value of {@link getSubMenuID}
	 **/
	public void setSubMenuID(CategoryList subMenuID) {
		this.subMenuID = subMenuID;
	}
	
	/**
	 * Get name
	 * 
	 * @return name
	 **/
	public String getName() {
		return name;
	}
	/**
	 * @param name new value of {@link getName}
	 **/
	public void setName(String name) {
		this.name = name;
	}
	

	/**
	 * Get image
	 * 
	 * @return image
	 **/
	public String getImage() {
		return image;
	}
	/**
	 * @param image new value of {@link getImage}
	 **/
	public void setImage(String image) {
		this.image = image;
	}


}
