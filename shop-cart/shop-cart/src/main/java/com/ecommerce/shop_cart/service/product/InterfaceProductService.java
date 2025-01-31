package com.ecommerce.shop_cart.service.product;

import com.ecommerce.shop_cart.model.Product;
import com.ecommerce.shop_cart.request.AddProductRequest;
import com.ecommerce.shop_cart.request.ProductUpdateRequest;

import java.util.List;

public interface InterfaceProductService {
    Product addProduct(AddProductRequest product);

    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProductById(ProductUpdateRequest product, Long productId);

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(Long category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String category, String name);
}
