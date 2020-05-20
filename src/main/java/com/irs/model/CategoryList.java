package com.irs.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.irs.model.type.Active;
@Entity
@Table(name = "SUB_MENU")
public class CategoryList  implements Serializable{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -7445697851420973302L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "SUB_MENU_ID")
	    private int id;
	    

	 //   @MapsId
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "FK_MENU_ID", referencedColumnName = "MENU_ID")
	    private Menu menuId;
	    
	    @Column(name="SUB_MENU_NAME", length = 255, unique = true)
	    private String subMenuName;
	    
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

		public Menu getMenuId() {
			return menuId;
		}

		public void setMenuId(Menu menuId) {
			this.menuId = menuId;
		}

		public String getSubMenuName() {
			return subMenuName;
		}

		public void setSubMenuName(String subMenuName) {
			this.subMenuName = subMenuName;
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

		public short getNotification() {
			return notification;
		}

		public void setNotification(short notification) {
			this.notification = notification;
		}

		

	   

}
