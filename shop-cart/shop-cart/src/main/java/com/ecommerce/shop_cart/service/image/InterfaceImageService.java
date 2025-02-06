package com.ecommerce.shop_cart.service.image;

import com.ecommerce.shop_cart.model.Image;
import org.springframework.web.multipart.MultipartFile;

public interface InterfaceImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    Image saveImage(MultipartFile file, Long productId);
    void updateImage(MultipartFile file, Long productId);

}
