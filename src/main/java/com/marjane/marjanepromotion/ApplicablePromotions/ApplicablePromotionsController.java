package com.marjane.marjanepromotion.ApplicablePromotions;

import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsRequestDTO;
import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/applicable_promotions")
public class ApplicablePromotionsController {

    private final ApplicablePromotionsService applicablePromotionsService;

    @GetMapping(path = "/all")
    public List<ApplicablePromotionsResponseDTO> getApplicationPromotions(){
        return applicablePromotionsService.getApplicablePromotions();
    }

    @PostMapping(path = "/create")
    public ApplicablePromotionsResponseDTO addApplicablePromotion(@RequestBody @Valid ApplicablePromotionsRequestDTO applicablePromotionsRequestDTO){
        return applicablePromotionsService.addApplicablePromotion(applicablePromotionsRequestDTO);
    }
}
