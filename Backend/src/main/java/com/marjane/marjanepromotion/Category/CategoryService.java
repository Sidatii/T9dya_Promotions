package com.marjane.marjanepromotion.Category;

import com.marjane.marjanepromotion.Category.DTO.CategoryRequestDTO;
import com.marjane.marjanepromotion.Category.DTO.CategoryResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@AllArgsConstructor
@Service
public class CategoryService implements CategoryServiceSpecification{

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;
    public CategoryService(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public CategoryResponseDTO addCategory(CategoryRequestDTO categoryRequestDTO) {
        return null;
    }

    @Override
    public CategoryResponseDTO getQCategory(Long categoryId) {
        return null;
    }

    @Override
    public List<CategoryResponseDTO> getCategories() {
        return categoryRepository.findAll().stream().
                map(category -> modelMapper.map(category, CategoryResponseDTO.class)).
                toList();
//        return categoryRepository.findAll();;
    }

    @Override
    public CategoryResponseDTO updateCategory(Long id, CategoryRequestDTO categoryRequestDTO) {
        return null;
    }

    @Override
    public CategoryResponseDTO deleteCategory(Long categoryId) {
        return null;
    }
}
