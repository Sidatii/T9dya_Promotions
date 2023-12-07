package com.marjane.marjanepromotion.Product;

import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Category.CategoryRepository;
import com.marjane.marjanepromotion.Exceptions.ResourceNotFoundException;
import com.marjane.marjanepromotion.Product.DTO.ProductRequestDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductResponseDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionResponseDTO;
import com.marjane.marjanepromotion.Promotion.Promotion;
import com.marjane.marjanepromotion.Promotion.PromotionRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@Data
@Service
@AllArgsConstructor
public class ProductService implements ProductServiceSpecification{
//    @Autowired
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private ModelMapper mapper;
    @Override
    public ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO) {
        Category category = categoryRepository.findById(productRequestDTO.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with the id: " + productRequestDTO.getCategoryId()));
        Product product = mapper.map(productRequestDTO, Product.class);
        product.setCategory(category);
        return mapper.map(productRepository.save(product), ProductResponseDTO.class);
    }
    @Override
    public ProductResponseDTO getProduct(Long promotionId) {
        return null;
    }

    @Override
    public Page<ProductResponseDTO> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable).map(product -> mapper.map(product, ProductResponseDTO.class));
    }

    @Override
    public ProductResponseDTO updateProduct(Long id, ProductRequestDTO promotionRequestDTO) {
        return null;
    }

    @Override
    public ProductResponseDTO deleteProduct(Long promotionId) {
        return null;
    }
}
