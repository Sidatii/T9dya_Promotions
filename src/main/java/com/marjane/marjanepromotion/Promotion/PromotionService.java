package com.marjane.marjanepromotion.Promotion;

import com.marjane.marjanepromotion.Category.DTO.CategoryResponseDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductRequestDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductResponseDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionRequestDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionResponseDTO;
import com.marjane.marjanepromotion.ServiceSpecification.ServiceSpecification;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
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
    public List<PromotionResponseDTO> getAll() {
        return promotionRepository.findAll().stream().
                map(promotion -> mapper.map(promotion, PromotionResponseDTO.class)).
                toList();
    }

    @Override
    public PromotionResponseDTO update(Long id, PromotionRequestDTO promotionRequestDTO) {
        return null;
    }

    @Override
    public PromotionResponseDTO delete(Long id) {
        return null;
    }
}
