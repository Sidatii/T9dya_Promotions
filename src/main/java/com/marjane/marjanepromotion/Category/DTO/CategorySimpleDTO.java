package com.marjane.marjanepromotion.Category.DTO;

import lombok.Data;

import java.util.Date;

//@SuppressWarnings({"unchecked"})
@Data
public class CategorySimpleDTO {
    private Long Id;
    private String Name;
    private Date CreatedAt;
    private Date UpdatedAt;
}
