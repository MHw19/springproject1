package com.example.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cart_Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cartItemId;
	double qty;
	//product_id 
	
	@ManyToOne
	@JoinColumn(name ="product_id")
	Product product;
	
	
	@ManyToOne
	@JoinColumn(name ="id_cart")
	Cart cart;
	
	
	
	
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Cart_Item(int cartItemId, double qty, Product product, Cart cart) {
		super();
		this.cartItemId = cartItemId;
		this.qty = qty;
		this.product = product;
		this.cart = cart;
	}
	public Cart_Item() {
		super();
	}
	
	
	
	
	
}
