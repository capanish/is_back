package com.irs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.irs.model.type.Active;

@Entity
@Table(name = "MENU")
public class Menu implements Serializable {

	private static final long serialVersionUID = 7707640553366178318L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MENU_ID")
	private int id;

	@Column(name = "MENU_NAME", nullable = false, length = 255)
	private String menuName;

	@Column(name = "IMAGE", length = 1000)
	private String image;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "ACTIVE", nullable = false)
	private Active active;

	@Column(name = "NOTIFICATION")
	private short notification;



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
	 * Get menuName
	 * 
	 * @return menuName
	 **/
	public String getMenuName() {
		return menuName;
	}
	/**
	 * @param menuName new value of {@link getMenuName}
	 **/
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * Get active
	 * 
	 * @return active
	 **/
	public Active getActive() {
		return active;
	}
	/**
	 * @param active new value of {@link getActive}
	 **/
	public void setActive(Active active) {
		this.active = active;
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

	/**
	 * Get notification
	 * 
	 * @return notification
	 **/
	public short getNotification() {
		return notification;
	}
	/**
	 * @param notification new value of {@link getNotification}
	 **/
	public void setNotification(short notification) {
		this.notification = notification;
	}
}
