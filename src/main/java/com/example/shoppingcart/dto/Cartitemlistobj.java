package com.example.shoppingcart.dto;

public class Cartitemlistobj {
	
	
	int cartId;
	public Cartitemlistobj() {
		super();
	}
	public Cartitemlistobj(int cartId, String productname, double qty, double price) {
		super();
		this.cartId = cartId;
		this.productname = productname;
		this.qty = qty;
		this.price = price;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	String productname;
	double qty;
	double price;
	
	

}
