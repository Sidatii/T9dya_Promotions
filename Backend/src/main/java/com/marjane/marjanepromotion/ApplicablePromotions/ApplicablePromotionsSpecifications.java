package com.marjane.marjanepromotion.ApplicablePromotions;

import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsRequestDTO;
import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsResponseDTO;
import com.marjane.marjanepromotion.Category.DTO.CategoryRequestDTO;
import com.marjane.marjanepromotion.Category.DTO.CategoryResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ApplicablePromotionsSpecifications {
    ApplicablePromotionsResponseDTO addApplicablePromotion(ApplicablePromotionsRequestDTO applicablePromotionsRequestDTO);

    ApplicablePromotionsResponseDTO getApplicablePromotion(Long applicablePromotionsId);

    Page<ApplicablePromotionsResponseDTO> getApplicablePromotions(Pageable pageable);

    ApplicablePromotionsResponseDTO updateApplicablePromotion(Long id, ApplicablePromotionsRequestDTO applicablePromotionsRequestDTO);

    ApplicablePromotionsResponseDTO deleteApplicablePromotion(Long applicablePromotionId);
}
