package com.example.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Load {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loadId;
	
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private Integer noOfTrucks;
	private Double weight;
	private String comment;
	
	@ManyToOne
    @JoinColumn(name = "shipperId")
	private Shipper shipper;
	
	private Date date;
	
	
	
	public Load() {
		super();
	}
	public Load(Long loadId, String loadingPoint, String unloadingPoint, String productType, String truckType,
			Integer noOfTrucks, Double weight, String comment, Shipper shipper, Date date) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipper = shipper;
		this.date = date;
	}
	public Long getLoadId() {
		return loadId;
	}
	public void setLoadId(Long loadId) {
		this.loadId = loadId;
	}
	
	
	public Shipper getshipper() {
		return shipper;
	}
	public void setshipper(Shipper shipper) {
		this.shipper = shipper;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public Integer getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(Integer noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
