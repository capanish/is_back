package com.irs.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.irs.model.type.Active;

public class CategoryList  implements Serializable{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -7445697851420973302L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int subMenuID;
	    

	    @MapsId
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "menuID", referencedColumnName = "menuID")
	    private Menu menuID;
	    
	    @Column(length = 255, unique = true)
	    private String name;
	    
	    @Column(length = 1000)
	    private String image;
	    
	    @Enumerated(EnumType.STRING)
	    private Active active;
	    
	    public int getSubMenuID() {
			return subMenuID;
		}

		public void setSubMenuID(int subMenuID) {
			this.subMenuID = subMenuID;
		}

		public Menu getMenuID() {
			return menuID;
		}

		public void setMenuID(Menu menuID) {
			this.menuID = menuID;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public Active getActive() {
			return active;
		}

		public void setActive(Active active) {
			this.active = active;
		}

		

	   

}
