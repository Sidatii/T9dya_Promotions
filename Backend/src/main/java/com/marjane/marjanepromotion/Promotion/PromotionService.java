package com.marjane.marjanepromotion.Promotion;

import Enums.Status;
import com.marjane.marjanepromotion.Category.DTO.CategoryResponseDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductRequestDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductResponseDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionRequestDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionResponseDTO;
import com.marjane.marjanepromotion.ServiceSpecification.ServiceSpecification;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PromotionService implements ServiceSpecification<PromotionResponseDTO, PromotionRequestDTO> {

    private PromotionRepository promotionRepository;
    private ModelMapper mapper;

    @Override
    public PromotionResponseDTO add(PromotionRequestDTO promotionRequestDTO) {
        Promotion promotion = mapper.map(promotionRequestDTO, Promotion.class);
        return mapper.map(promotionRepository.save(promotion), PromotionResponseDTO.class);
    }

    @Override
    public PromotionResponseDTO get(Long id) {
        return null;
    }

    @Override
    public Page<PromotionResponseDTO> getAll(Pageable pageable) {
        return promotionRepository.findAll(pageable).
                map(promotion -> mapper.map(promotion, PromotionResponseDTO.class));
    }

    @Override
    public PromotionResponseDTO update(Long id, PromotionRequestDTO promotionRequestDTO) {
        return promotionRepository.findById(id).map(promotion -> {
            promotion.setRate(promotionRequestDTO.getRate());
            promotion.setExpiry(promotionRequestDTO.getExpiry());
            promotion.setStatus(Status.PENDING);
            return mapper.map(promotionRepository.save(promotion), PromotionResponseDTO.class);
        }).orElseThrow(() -> new IllegalStateException("Promotion with id " + id + " does not exists"));
    }

    @Override
    public PromotionResponseDTO delete(Long id) {
        return null;
    }

    public PromotionResponseDTO getPromotion(Long promotionId) {
        Promotion promotion = promotionRepository.findById(promotionId).orElseThrow(() -> new IllegalStateException("Promotion with id " + promotionId + " does not exists"));
        return mapper.map(promotion, PromotionResponseDTO.class);
    }
}
