package com.ashokit.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "VENDOR")
public class VendorEntity {

	@Id
	@Column(name = "VEN_ID")
	private Integer vendorId;

	@Column(name = "VEN_NAME")
	private String vendorName;
}
