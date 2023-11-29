package com.marjane.marjanepromotion.ApplicablePromotions.DTO;

import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Product.Product;
import com.marjane.marjanepromotion.Promotion.Promotion;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

//@SuppressWarnings({"unchecked"})
@Data
public class ApplicablePromotionsSimpleDTO {
    private Long Id;
//    private Promotion promotion;
//    private Category category;
//    private Product product;
    private Date CreatedAt;
}
