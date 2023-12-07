package com.marjane.marjanepromotion.ApplicablePromotions;

import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsRequestDTO;
import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/applicable_promotions")
public class ApplicablePromotionsController {

    private final ApplicablePromotionsService applicablePromotionsService;

    @GetMapping(path = "/all")
    public Page<ApplicablePromotionsResponseDTO> getApplicationPromotions(Pageable pageable){
        return applicablePromotionsService.getApplicablePromotions(pageable);
    }

    @PostMapping(path = "/create")
    public ApplicablePromotionsResponseDTO addApplicablePromotion(@RequestBody @Valid ApplicablePromotionsRequestDTO applicablePromotionsRequestDTO){
        return applicablePromotionsService.addApplicablePromotion(applicablePromotionsRequestDTO);
    }
}
