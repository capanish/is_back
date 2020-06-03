package com.irs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.irs.model.type.Active;
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
    /*
    @Column
    private Date procureDate;
    */
    @Column(length = 1000)
    private String image;
    /*
    @Enumerated(EnumType.ORDINAL)
    private Active active;
    
    @Column(name = "SUGAR")
	private short sugar;
    
    @Column(name = "PROTEIN")
   	private short protein;
    
    @Column(name = "WATER")
   	private short water;
    
    @Column(name = "CALCIUM")
   	private short calcium;
    
    @Column(name = "SODIUM")
   	private short sodium;
    
    @Column(name = "IRON")
   	private short iron;
    
    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;
    
    @Column(name = "LOCATION")
    private String location;
*/

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
/*
	public Date getProcureDate() {
		return procureDate;
	}

	public void setProcureDate(Date procureDate) {
		this.procureDate = procureDate;
	}
*/
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

/*
	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
	}

	public short getSugar() {
		return sugar;
	}

	public void setSugar(short sugar) {
		this.sugar = sugar;
	}

	public short getProtein() {
		return protein;
	}

	public void setProtein(short protein) {
		this.protein = protein;
	}

	public short getWater() {
		return water;
	}

	public void setWater(short water) {
		this.water = water;
	}

	public short getCalcium() {
		return calcium;
	}

	public void setCalcium(short calcium) {
		this.calcium = calcium;
	}

	public short getSodium() {
		return sodium;
	}

	public void setSodium(short sodium) {
		this.sodium = sodium;
	}

	public short getIron() {
		return iron;
	}

	public void setIron(short iron) {
		this.iron = iron;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	*/
}
