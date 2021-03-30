package com.example.shoppingcart.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.shoppingcart.dto.Cartitemlistobj;
import com.example.shoppingcart.dto.productlistobj;
import com.example.shoppingcart.model.Product;

@Repository
public interface Productrepository extends JpaRepository<Product,Integer> {
	
	
	@Query("SELECT new com.example.shoppingcart.dto.productlistobj(u.productId,u.productname,u.price) FROM Product u")
	List<productlistobj> getproductlist();
	//
	//Product Cart_Item
	@Query("SELECT  new com.example.shoppingcart.dto.Cartitemlistobj(c.cartId,u.productname,ci.qty,u.price) FROM  Product u  JOIN Cart_Item ci ON u.productId=ci.product  JOIN  Cart c ON c.cartId=ci.cart")
	List<Cartitemlistobj> getcartlist();
	
	
	

}
