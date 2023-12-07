package com.marjane.marjanepromotion.ApplicablePromotions;

import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsRequestDTO;
import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsResponseDTO;
import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Category.CategoryRepository;
import com.marjane.marjanepromotion.Category.DTO.CategoryResponseDTO;
import com.marjane.marjanepromotion.Exceptions.ResourceNotFoundException;
import com.marjane.marjanepromotion.Product.Product;
import com.marjane.marjanepromotion.Product.ProductRepository;
import com.marjane.marjanepromotion.Promotion.Promotion;
import com.marjane.marjanepromotion.Promotion.PromotionRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicablePromotionsService implements ApplicablePromotionsSpecifications{
    private final ApplicablePromotionsRepository applicablePromotionsRepository;
    private final PromotionRepository promotionRepository;
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    @Override
    public ApplicablePromotionsResponseDTO addApplicablePromotion(ApplicablePromotionsRequestDTO applicablePromotionsRequestDTO) {
        Promotion promotion = promotionRepository.findById(applicablePromotionsRequestDTO.getPromotionId())
                .orElseThrow(() -> new ResourceNotFoundException("Promotion not found with the ID: " + applicablePromotionsRequestDTO.getPromotionId()));

        Category category = categoryRepository.findById(applicablePromotionsRequestDTO.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with the id: " + applicablePromotionsRequestDTO.getCategoryId()));

        Product product = productRepository.findById(applicablePromotionsRequestDTO.getProductId())
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with the id: " + applicablePromotionsRequestDTO.getProductId()));

        ApplicablePromotions applicablePromotions = modelMapper.map(applicablePromotionsRequestDTO, ApplicablePromotions.class);
        applicablePromotions.setPromotion(promotion);
        applicablePromotions.setProduct(product);
        applicablePromotions.setCategory(category);
        ApplicablePromotions savedApplicable = applicablePromotionsRepository.save(applicablePromotions);
        return modelMapper.map(savedApplicable, ApplicablePromotionsResponseDTO.class);
//        return new ApplicablePromotionsResponseDTO();

    }

    @Override
    public ApplicablePromotionsResponseDTO getApplicablePromotion(Long applicablePromotionsId) {
        return null;
    }

    @Override
    public Page<ApplicablePromotionsResponseDTO> getApplicablePromotions(Pageable pageable) {
        return applicablePromotionsRepository.findAll(pageable).
                map(applicablePromotions -> modelMapper.map(applicablePromotions, ApplicablePromotionsResponseDTO.class));
    }

    @Override
    public ApplicablePromotionsResponseDTO updateApplicablePromotion(Long id, ApplicablePromotionsRequestDTO applicablePromotionsRequestDTO) {
        return null;
    }

    @Override
    public ApplicablePromotionsResponseDTO deleteApplicablePromotion(Long applicablePromotionId) {
        return null;
    }
}
