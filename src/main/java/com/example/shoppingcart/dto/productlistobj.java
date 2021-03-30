package com.example.shoppingcart.dto;

public class productlistobj {
	
	
	int productId;
    String productname;
    double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public productlistobj(int productId, String productname, double price) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.price = price;
	}
	public productlistobj() {
		super();
	}
    
    
    
    
    
    
	
	
	
	
}
