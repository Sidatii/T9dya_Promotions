package com.marjane.marjanepromotion.Category.DTO;

import com.marjane.marjanepromotion.ApplicablePromotions.ApplicablePromotions;
import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsSimpleDTO;
import com.marjane.marjanepromotion.Product.Product;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionSimpleDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CategoryResponseDTO {
    private Long Id;
    private String Name;
    private List<PromotionSimpleDTO> products;
    private List<ApplicablePromotionsSimpleDTO> applicablePromotions;
    private Date CreatedAt;
    private Date UpdatedAt;
}
