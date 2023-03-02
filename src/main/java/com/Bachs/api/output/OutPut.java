package com.Bachs.api.output;

import com.Bachs.dto.NewsDTO;

import java.util.List;

public class OutPut {
    private int totalPage;
    private int page;
    private List<NewsDTO> items;
    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<NewsDTO> getItems() {
        return items;
    }

    public void setItems(List<NewsDTO> items) {
        this.items = items;
    }
}
