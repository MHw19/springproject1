package com.example.shoppingcart.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.shoppingcart.model.Cart;


@Repository
public interface Cartrepository extends JpaRepository<Cart,Integer> {

}
