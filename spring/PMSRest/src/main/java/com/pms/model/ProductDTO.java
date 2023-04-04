package com.pms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class ProductDTO implements Serializable {
	private Integer productId;

	private String productName;
	private Double price;
	
	private String manufacturer;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	

}
