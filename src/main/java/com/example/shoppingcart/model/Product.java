package com.example.shoppingcart.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	public Product() {
		super();
	}

	

	
	



	public Product(int productId, String productname, String productdes, double price) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.productdes = productdes;
		this.price = price;
	}




	String productname;
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}


	String productdes;
	double price;
	
	
	
	
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductdes() {
		return productdes;
	}

	public void setProductdes(String productdes) {
		this.productdes = productdes;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	

}
