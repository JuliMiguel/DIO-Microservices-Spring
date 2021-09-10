package com.dio.ShoppingCart.Repository;

import com.dio.ShoppingCart.Model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
