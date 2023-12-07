package com.marjane.marjanepromotion.ApplicablePromotions.DTO;

import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Product.Product;
import com.marjane.marjanepromotion.Promotion.Promotion;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ApplicablePromotionsRequestDTO {
    private Long Id;
    private Long promotionId;
    private Long categoryId;
    private Long productId;
}
