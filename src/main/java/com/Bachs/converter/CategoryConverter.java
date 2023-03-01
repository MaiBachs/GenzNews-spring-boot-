package com.Bachs.converter;

import com.Bachs.dto.CategoryDTO;
import com.Bachs.entity.CategoryEntity;
import com.Bachs.entity.NewsEntity;

public class CategoryConverter {
    public static CategoryDTO toCategoryDTO(CategoryEntity categoryEntity){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCode(categoryEntity.getCode());
        categoryDTO.setName(categoryEntity.getName());
        categoryDTO.setId(categoryEntity.getId());
        categoryDTO.setCreatedBy(categoryEntity.getCreatedBy());
        categoryDTO.setCreatedDate(categoryEntity.getCreatedDate());
        return categoryDTO;
    }
    public static CategoryEntity toCategoryEntity(CategoryDTO categoryDTO){
        CategoryEntity categoryEntity = new CategoryEntity();
        if(categoryDTO.getId() != null){
            categoryEntity.setId(categoryDTO.getId());
            categoryEntity.setCreatedBy(categoryDTO.getCreatedBy());
            categoryEntity.setCreatedDate(categoryDTO.getCreatedDate());
        }
        categoryEntity.setCode(categoryDTO.getCode());
        categoryEntity.setName(categoryDTO.getName());
        return categoryEntity;
    }
}
