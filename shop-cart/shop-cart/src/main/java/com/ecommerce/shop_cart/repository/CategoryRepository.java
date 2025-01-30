package com.ecommerce.shop_cart.repository;
import com.ecommerce.shop_cart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
    boolean existsByName(String name);
}