package com.marjane.marjanepromotion.Category;

import com.marjane.marjanepromotion.Category.DTO.CategoryRequestDTO;
import com.marjane.marjanepromotion.Category.DTO.CategoryResponseDTO;

import java.util.List;

public interface CategoryServiceSpecification {
    CategoryResponseDTO addCategory(CategoryRequestDTO categoryRequestDTO);

    CategoryResponseDTO getQCategory(Long categoryId);

    List<CategoryResponseDTO> getCategories();

    CategoryResponseDTO updateCategory(Long id, CategoryRequestDTO categoryRequestDTO);

    CategoryResponseDTO deleteCategory(Long categoryId);
}
