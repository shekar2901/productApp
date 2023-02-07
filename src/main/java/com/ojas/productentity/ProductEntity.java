package com.ojas.productentity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {

	@Id
	@Column(name="pid")
	private int productId;
	@Column(name="pname")
	private String productName;
	@Column(name="pquantity")
	private int productQuantity;
	@Column(name="pprice")
	private double productPrice;
	@Column(name="createdatetime")
	private LocalDate createdDate;
	@Column(name="updateddatetime")
	private LocalDate updatedDate;

	public ProductEntity() {

	}

	public ProductEntity(int productId, String productName, int productQuantity, double productPrice,
			LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}


}

