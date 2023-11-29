package com.marjane.marjanepromotion.Promotion.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PromotionRequestDTO {
    private Double Rate;
    private Enums.Status Status;
}
