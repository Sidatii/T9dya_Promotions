package com.marjane.marjanepromotion.Product.DTO;

import com.marjane.marjanepromotion.ApplicablePromotions.ApplicablePromotions;
import com.marjane.marjanepromotion.ApplicablePromotions.DTO.ApplicablePromotionsSimpleDTO;
import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Category.DTO.CategorySimpleDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProductResponseDTO {
    private Long Id;
    private String name;
    private int Quantity;
    private Double Price;
    private CategorySimpleDTO category;
    private List<ApplicablePromotionsSimpleDTO> applicablePromotions;
    private Date CreatedAt;
    private Date UpdatedAt;
}
