package com.Bachs.entity;

import javax.persistence.*;

@Entity
@Table(name="News")
public class NewsEntity extends BaseEntity{

    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String thumbnail;
    @Column
    private String shortdescription;
    @Column
    private Long categoryid;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryEntity categoryEntity;

    public NewsEntity() {
    }

    public NewsEntity(String title, String content, String thumbnail, String shortdescription, Long categoryid) {
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

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }
}
