package com.irs.model;

import java.io.Serializable;
import java.util.Date;

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

public class NutriInfo implements Serializable{


	private static final long serialVersionUID = -4048572595148505336L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int infoID;
    
    @MapsId
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subMenuID", referencedColumnName = "subMenuID")
    private CategoryList subMenuID;
    
    @Column
    private Date procureDate;
    
    @Column(length = 1000)
    private String image;
    
    @Enumerated(EnumType.STRING)
    private Active active;
}
