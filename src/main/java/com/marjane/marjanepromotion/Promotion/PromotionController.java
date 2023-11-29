package com.marjane.marjanepromotion.Promotion;

import com.marjane.marjanepromotion.Promotion.DTO.PromotionRequestDTO;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/promotions")
@AllArgsConstructor
public class PromotionController {
    private PromotionService promotionService;

    @PostMapping(path = "/create")
    public PromotionResponseDTO AddPromotion(@RequestBody @Valid PromotionRequestDTO promotionRequestDTO){
        return promotionService.add(promotionRequestDTO);
    }

    @GetMapping(path = "/all")
    public List<PromotionResponseDTO> getPromotions(){
        return promotionService.getAll();
    }
}