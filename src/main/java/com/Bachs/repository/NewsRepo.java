package com.Bachs.repository;

import com.Bachs.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepo extends JpaRepository<NewsEntity, Long>{
}
