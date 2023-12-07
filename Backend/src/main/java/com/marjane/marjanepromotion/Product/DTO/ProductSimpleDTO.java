package com.marjane.marjanepromotion.Product.DTO;

import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Category.DTO.CategorySimpleDTO;
import lombok.Data;

import java.util.Date;

@Data
public class ProductSimpleDTO {
    private Long Id;
    private String name;
    private int Quantity;
    private Double Price;
//    private CategorySimpleDTO category;
    private Date CreatedAt;
    private Date UpdatedAt;


}
