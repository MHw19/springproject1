package com.example.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoppingcart.model.Cart_Item;


@Repository
public interface Cartitemrepository extends JpaRepository<Cart_Item,Integer> {

}
