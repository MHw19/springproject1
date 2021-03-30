package com.example.shoppingcart.model;

import java.io.Serializable;
import java.util.Date;
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
public class Cart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cartId;
	double total;
	Date cratedate;
	
	

	public Cart(int cartId, double total, Date cratedate) {
		super();
		this.cartId = cartId;
		this.total = total;
		this.cratedate = cratedate;
	}

	

	public Cart() {
		super();
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getCratedate() {
		return cratedate;
	}

	public void setCratedate(Date cratedate) {
		this.cratedate = cratedate;
	}

	
	
	
	
	
}
