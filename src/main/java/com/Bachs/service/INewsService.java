package com.Bachs.service;

import com.Bachs.dto.NewsDTO;

import java.util.List;

public interface INewsService {
    NewsDTO save(NewsDTO newsDTO);
    List<NewsDTO> delete(List<Long> ids);
    List<NewsDTO> views();

}
