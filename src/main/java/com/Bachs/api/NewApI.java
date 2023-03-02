package com.Bachs.api;

import com.Bachs.api.output.OutPut;
import com.Bachs.dto.NewsDTO;
import com.Bachs.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewApI {
    @Autowired
    private INewsService newsService;

    @GetMapping(value = "/pagination")
    public OutPut pagination(@RequestParam(name = "limit") int limit, @RequestParam(name = "page") int page){
        int totalPage = (int) Math.ceil(newsService.views().size()/limit);
        Pageable pageable = PageRequest.of(page-1,limit);
        OutPut outPut = new OutPut();
        outPut.setTotalPage(totalPage);
        outPut.setPage(page);
        outPut.setItems(newsService.findAll(pageable));
        return outPut;
    }
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
