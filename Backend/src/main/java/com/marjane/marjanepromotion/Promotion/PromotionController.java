package com.marjane.marjanepromotion.Promotion;

import com.marjane.marjanepromotion.Promotion.DTO.PromotionRequestDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/promotions")
@AllArgsConstructor
@CrossOrigin("*")
public class PromotionController {
    private PromotionService promotionService;

    @GetMapping(path = "/{promotionId}")
    public PromotionResponseDTO getPromotion(@PathVariable("promotionId") Long promotionId){
        return promotionService.getPromotion(promotionId);
    }
    @PostMapping(path = "/create")
    public PromotionResponseDTO AddPromotion(@RequestBody @Valid PromotionRequestDTO promotionRequestDTO){
        return promotionService.add(promotionRequestDTO);
    }

    @GetMapping(path = "/all")
    public Page<PromotionResponseDTO> getPromotions(Pageable pageable){
        return promotionService.getAll(pageable);
    }
}
