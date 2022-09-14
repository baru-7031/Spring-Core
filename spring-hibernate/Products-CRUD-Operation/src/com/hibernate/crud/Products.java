package com.hibernate.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Products {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int productId;
	
	@Column(name="p_price")
	private int productPrice;
	
	@Column(name="p_quantity")
	private int productQuantity;
	
	@Column(name="p_name")
	private String productName;
	
	@Column(name="p_description")
	private String productDescription;
	
	public Products() {
		
	}
	
	public Products(int productPrice, int productQuantity, String productName,
			String productDescription) {
		
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productName = productName;
		this.productDescription = productDescription;
		
	}

	// All Fields Getter, Setter, and toString 

	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	@Override
	public String toString() {
		return "products [productId=" + productId + ", productPrice=" + productPrice + ", productQuantity="
				+ productQuantity + ", productName=" + productName + ", productDescription=" + productDescription + "]";
	}
	
}








