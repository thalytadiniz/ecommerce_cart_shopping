package com.ecommerce.shop_cart.repository;

import com.ecommerce.shop_cart.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
