package com.Bachs.api;

import com.Bachs.dto.NewsDTO;
import com.Bachs.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewApI {
    @Autowired
    private INewsService newsService;

    @PostMapping(value = "/news")
    public NewsDTO createNews(@RequestBody NewsDTO newsDTO)
    {
        return  newsService.save(newsDTO);
    }
    @GetMapping(value = "/news")
    public List<NewsDTO> getNews(){
        return newsService.views();
    }
    @PutMapping(value = "/news")
    public NewsDTO updateNews(@RequestBody NewsDTO newsDTO){
        newsService.save(newsDTO);
        return newsDTO;
    }
    @DeleteMapping(value = "/news")
    public List<NewsDTO> deleteNews(@RequestBody List<Long> ids){
        List<NewsDTO> newsDTOList = null;
        return newsService.delete(ids);
    }
}
