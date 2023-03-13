package com.ashokit.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity

@Table(name="PRODUCTS")
@Data
public class ProductEntity {

	@Id
	@Column(name="PROD_ID")
	private Integer productId;
	
	@Column(name="PROD_NAME")
	private String productName;
	
	@ManyToOne( cascade = CascadeType.PERSIST, fetch = FetchType.LAZY )
	@JoinColumn( name = "VEN_ID_FK")
	private VendorEntity vendorEntity;
}
