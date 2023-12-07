package com.marjane.marjanepromotion.Product;

import com.marjane.marjanepromotion.Product.DTO.ProductRequestDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductResponseDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionRequestDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductServiceSpecification {
    ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO);

    ProductResponseDTO getProduct(Long productId);

    Page<ProductResponseDTO> getProducts(Pageable pageable);

    ProductResponseDTO updateProduct(Long id, ProductRequestDTO productRequestDTO);

    ProductResponseDTO deleteProduct(Long productId);
}
