package com.Bachs.repository;

import com.Bachs.entity.CategoryEntity;
import com.Bachs.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Long> {
}
