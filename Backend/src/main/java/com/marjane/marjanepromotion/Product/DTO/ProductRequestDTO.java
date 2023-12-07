package com.marjane.marjanepromotion.Product.DTO;

import com.marjane.marjanepromotion.Category.Category;
import lombok.Data;

import java.util.Date;

@Data
public class ProductRequestDTO {
    private String Name;
    private int Quantity;
    private Double Price;
    private Long CategoryId;
}
