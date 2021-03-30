package com.example.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingcart.dto.Cartitemlistobj;
import com.example.shoppingcart.dto.productlistobj;
import com.example.shoppingcart.model.Cart_Item;
import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.service.Productservice;

   @RestController
   @RequestMapping("/products")
  public class Productcontroller {
	
	@Autowired
	Productservice service;
	
	@PostMapping("/saveproduct")
	public Product addproduct(@RequestBody @RequestParam("productname")String productname,@RequestBody @RequestParam("productdes")String productdes,@RequestBody @RequestParam("price")Double price) {
		
		Product p=new Product();
		p.setProductname(productname);
		p.setProductdes(productdes);
		p.setPrice(price);
		
		return service.addproduct(p);
		
	}
	
	
	
	@PostMapping("/addcartitem")
	public Cart_Item  addcartitem(@RequestBody @RequestParam("cartId")int cartId,@RequestBody @RequestParam("productId")int productId,@RequestBody @RequestParam("qty")Double qty) {
		
		
		
		
		
		
		return service.addcartitem(cartId,productId,qty);
		
	}
	
	
	 @DeleteMapping("/deletecartitemById/{Id}")
	   
	   
	   public String deleteuserId(@PathVariable int Id) {
		   
		   
		   
		return service.deletecartitemById(Id);   
		   
	   }
	
	 @DeleteMapping("/deleteproductById/{Id}")
	   
	   
	   public String deleteproductById(@PathVariable int Id) {
		   
		   
		   
		return service.deleteproduct(Id);   
		   
	   }
	 
	 
	 
	 @GetMapping("/getproductlist")
	 
	 public List<productlistobj> getproductlist() {
		 
		 
		 return  service.getproductlist();
		 
		 
	 }
	 
      @GetMapping("/getcartlist")
	 
	 public List<Cartitemlistobj>getcartlist() {
		 
		 
		 return service.getcartlist();
		 
		 
	 }
	 
      
      @PutMapping("/upadteproduct")
      
      public Product upadteproduct(@RequestBody Product product) {
    	  
    	  
    	  return service.updateproduct(product);
    	  
      }
      
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
}

