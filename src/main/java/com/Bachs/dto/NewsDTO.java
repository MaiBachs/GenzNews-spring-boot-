package com.Bachs.dto;

public class NewsDTO extends BaseDTO {

    private String title;
    private String content;
    private String thumbnail;
    private String shortdescription;
    private Long categoryid;
    private CategoryDTO categoryDTO;

    public NewsDTO() {
    }

    public NewsDTO(String title, String content, String thumbnail, String shortdescription, Long categoryid) {
        this.title = title;
        this.content = content;
        this.thumbnail = thumbnail;
        this.shortdescription = shortdescription;
        this.categoryid = categoryid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public CategoryDTO getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
    }
}
