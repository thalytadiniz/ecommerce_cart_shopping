package com.ecommerce.shop_cart.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        
        super(message);
    }
}
