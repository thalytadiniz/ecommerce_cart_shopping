package com.ecommerce.shop_cart.service.image;

import com.ecommerce.shop_cart.dto.ImageDto;
import com.ecommerce.shop_cart.model.Image;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface InterfaceImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file,  Long imageId);
}
