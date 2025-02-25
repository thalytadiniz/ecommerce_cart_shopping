package com.ecommerce.shop_cart.service.product;

import com.ecommerce.shop_cart.model.Product;
import com.ecommerce.shop_cart.request.AddProductRequest;
import com.ecommerce.shop_cart.request.ProductUpdateRequest;

import java.util.List;

public interface InterfaceProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);

    Product updateProduct(ProductUpdateRequest request, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

}