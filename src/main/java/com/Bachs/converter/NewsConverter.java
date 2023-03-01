package com.Bachs.converter;

import com.Bachs.dto.NewsDTO;
import com.Bachs.entity.NewsEntity;

import java.util.Optional;

public class NewsConverter{
    public static NewsDTO toNewsDTO(NewsEntity newsEntity){
        NewsDTO newsDTO = new NewsDTO();
        newsDTO.setTitle(newsEntity.getTitle());
        newsDTO.setContent(newsEntity.getContent());
        newsDTO.setCategoryid(newsEntity.getCategoryid());
        newsDTO.setThumbnail(newsEntity.getThumbnail());
        newsDTO.setShortdescription(newsEntity.getShortdescription());
        newsDTO.setId(newsEntity.getId());
        newsDTO.setCreatedBy(newsEntity.getCreatedBy());
        newsDTO.setCreatedDate(newsEntity.getCreatedDate());
        newsDTO.setCategoryDTO(CategoryConverter.toCategoryDTO(newsEntity.getCategoryEntity()));
        return newsDTO;
    }
    public static NewsEntity toNewsEntity(NewsDTO newsDTO){
        NewsEntity newsEntity = new NewsEntity();
        if(newsDTO.getId() != null){
            newsEntity.setId(newsDTO.getId());
            newsEntity.setCreatedBy(newsDTO.getCreatedBy());
            newsEntity.setCreatedDate(newsDTO.getCreatedDate());
        }
        newsEntity.setTitle(newsDTO.getTitle());
        newsEntity.setContent(newsDTO.getContent());
        newsEntity.setThumbnail(newsDTO.getThumbnail());
        newsEntity.setCategoryid(newsDTO.getCategoryid());
        newsEntity.setShortdescription(newsDTO.getShortdescription());
        newsEntity.setCategoryEntity(CategoryConverter.toCategoryEntity(newsDTO.getCategoryDTO()));
        return  newsEntity;
    }
}
