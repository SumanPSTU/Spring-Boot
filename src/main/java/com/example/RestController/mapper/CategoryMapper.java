package com.example.RestController.mapper;

import com.example.RestController.dto.CategoryDTO;
import com.example.RestController.entity.Category;

public class CategoryMapper {

    public static CategoryDTO toCreateDTO(Category category){
        if (category == null) return null;

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setProducts(category.getProducts().stream().map());
    }


    public static Category toCategoryEntity(CategoryDTO categoryDTO){
        Category category = new Category();
        category.setName(categoryDTO.getName());
        return category;
    }
}
