package com.marjane.marjanepromotion.Product;

import com.marjane.marjanepromotion.Product.DTO.ProductRequestDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductResponseDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionRequestDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionResponseDTO;

import java.util.List;

public interface ProductServiceSpecification {
    ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO);

    ProductResponseDTO getProduct(Long productId);

    List<ProductResponseDTO> getProducts();

    ProductResponseDTO updateProduct(Long id, ProductRequestDTO productRequestDTO);

    ProductResponseDTO deleteProduct(Long productId);
}
