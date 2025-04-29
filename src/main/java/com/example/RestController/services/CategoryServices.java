package com.example.RestController.services;


import com.example.RestController.dto.CategoryDTO;
import com.example.RestController.entity.Category;
import com.example.RestController.mapper.CategoryMapper;
import com.example.RestController.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServices {
    // create category
    public CategoryRepository categoryRepository;
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
        Category category = CategoryMapper.toCategoryEntity(categoryDTO);
        category = categoryRepository.save(category);
        return CategoryMapper.toCreateDTO(category);
    }

    //get all category

    // get category by id

    //update category

    //delete category


}
