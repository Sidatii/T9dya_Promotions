package com.marjane.marjanepromotion.ApplicablePromotions.DTO;

import com.marjane.marjanepromotion.ApplicablePromotions.ApplicablePromotions;
import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Category.DTO.CategorySimpleDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductSimpleDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductSimpleSpecialDTO;
import com.marjane.marjanepromotion.Product.Product;
import com.marjane.marjanepromotion.Promotion.DTO.PromotionSimpleDTO;
import com.marjane.marjanepromotion.Promotion.Promotion;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ApplicablePromotionsResponseDTO {
    private Long Id;
    private PromotionSimpleDTO promotion;
    private CategorySimpleDTO category;
    private ProductSimpleSpecialDTO product;
    private Date CreatedAt;
}
