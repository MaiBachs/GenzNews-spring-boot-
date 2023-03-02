package com.Bachs.service.impl;

import com.Bachs.converter.NewsConverter;
import com.Bachs.dto.NewsDTO;
import com.Bachs.entity.NewsEntity;
import com.Bachs.repository.CategoryRepo;
import com.Bachs.repository.NewsRepo;
import com.Bachs.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService implements INewsService {
    @Autowired
    private NewsRepo newsRepo;
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public NewsDTO save(NewsDTO newsDTO) {
        NewsEntity newsEntity = NewsConverter.toNewsEntity(newsDTO);
        newsRepo.save(newsEntity);
        return newsDTO;
    }
    // chưa hoàn thành

    @Override
    public List<NewsDTO> delete(List<Long> ids) {
        List<NewsDTO> newsDTOList = new ArrayList<NewsDTO>();
        for(Long id: ids){
            newsDTOList.add(NewsConverter.toNewsDTO(newsRepo.findById(id).orElse(null)));
            newsRepo.deleteById(id);
        }
        return newsDTOList;
    }

    @Override
    public List<NewsDTO> views() {
        List<NewsDTO> newsDTOList = new ArrayList<NewsDTO>();
        List<NewsEntity> newsEntityList = newsRepo.findAll();
        for(NewsEntity  newsEntity: newsEntityList){
            newsDTOList.add(NewsConverter.toNewsDTO(newsEntity));
        }
        return newsDTOList;
    }

    @Override
    public List<NewsDTO> findAll(Pageable pageable) {
        Page<NewsEntity> pagedResult =  newsRepo.findAll(pageable);
        List<NewsEntity> list = pagedResult.getContent();
        List<NewsDTO> newsDTOList = new ArrayList<NewsDTO>();
        for(NewsEntity newsEntity: list){
            newsDTOList.add(NewsConverter.toNewsDTO(newsEntity));
        }
        return newsDTOList;
    }
}
