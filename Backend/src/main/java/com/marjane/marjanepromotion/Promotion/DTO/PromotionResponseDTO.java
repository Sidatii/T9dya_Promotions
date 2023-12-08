package com.marjane.marjanepromotion.Promotion.DTO;

import com.fasterxml.jackson.databind.DatabindException;
import com.marjane.marjanepromotion.ApplicablePromotions.ApplicablePromotions;
import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsResponseDTO;
import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsSimpleDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class PromotionResponseDTO {
    private Long Id;
    private Double Rate;
    private Enums.Status Status;
    private List<ApplicablePromotionsSimpleDTO> applicablePromotions;
    private Date CreatedAt;
    private Date UpdatedAt;
    private Date Expiry;
}
