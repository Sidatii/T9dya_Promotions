package com.marjane.marjanepromotion.Promotion.DTO;

import Enums.Status;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PromotionSimpleDTO {
    private Long Id;
    private Double Rate;
    private Enums.Status Status;
    private Date CreatedAt;
    private Date UpdatedAt;
}
