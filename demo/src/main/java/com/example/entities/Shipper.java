package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shipper {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shipperId;
	
	private String shipperName;
	

	public Shipper(Long shipperId, String shipperName) {
		super();
		this.shipperId = shipperId;
		this.shipperName = shipperName;
	}

	public Long getShipperId() {
		return shipperId;
	}

	public void setShipperId(Long shipperId) {
		this.shipperId = shipperId;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	
	
}
