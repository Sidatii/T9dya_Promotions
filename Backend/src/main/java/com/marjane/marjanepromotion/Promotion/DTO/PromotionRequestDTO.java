package com.marjane.marjanepromotion.Promotion.DTO;

import Enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PromotionRequestDTO {
    private Double Rate;
    private Date Expiry;
    private Enums.Status Status = Enums.Status.PENDING;
}
