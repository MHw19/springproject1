package com.example.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingcart.dto.Cartitemlistobj;
import com.example.shoppingcart.dto.productlistobj;
import com.example.shoppingcart.model.Cart;
import com.example.shoppingcart.model.Cart_Item;
import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.repository.Cartitemrepository;
import com.example.shoppingcart.repository.Cartrepository;
import com.example.shoppingcart.repository.Productrepository;

@Service
public class Productservice {
	
	
	@Autowired
	Productrepository productrepository;
	
	@Autowired
	Cartrepository cartrepository;
	
	
	@Autowired
	Cartitemrepository cartitemrepository;
	
	public Product addproduct(Product p) {
		
		return productrepository.save(p);
		
		
	}
	
	
	//
	public Cart_Item addcartitem(int cartid,int prodctid ,double qty) {
		
     Cart  c=cartrepository.findById(cartid).orElse(null);
     System.out.println(cartid);
    Product p =productrepository.findById(prodctid).orElse(null);
  
  
    Cart_Item ci=new Cart_Item();
    
    ci.setCart(c);
    ci.setProduct(p);
    ci.setQty(qty);
		
		
		
		return  cartitemrepository.save(ci);
	}
	
	
	public String deletecartitemById(int Id) {
		
		cartitemrepository.deleteById(Id);
		
		
		return "Deleted cart item"+Id;
		
		
	}
	
	
	
public String deleteproduct(int Id) {
		
		productrepository.deleteById(Id);
		
		
		return "Deleted product"+Id;
		
		
	}




   public List<productlistobj> getproductlist() {
	   
	   return productrepository.getproductlist();
	   
	   
   }
	
	
public List<Cartitemlistobj> getcartlist() {
	   
	   return productrepository.getcartlist();
	   
	   
   }
	
public Product updateproduct(Product product) {
	
	Product avlproduct=productrepository.findById(product.getProductId()).orElse(null);
	
	if(avlproduct !=null) {
		
		avlproduct.setProductname(product.getProductname());
		avlproduct.setProductdes(product.getProductdes());
		avlproduct.setPrice(product.getPrice());
		
		
		
	}
	   
	   return productrepository.save(avlproduct);
	   
	   
}
	
	
	
	

}
