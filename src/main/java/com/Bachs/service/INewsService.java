package com.Bachs.service;

import com.Bachs.dto.NewsDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface INewsService {
    NewsDTO save(NewsDTO newsDTO);
    List<NewsDTO> delete(List<Long> ids);
    List<NewsDTO> views();
    List<NewsDTO> findAll(Pageable pageable);
}
