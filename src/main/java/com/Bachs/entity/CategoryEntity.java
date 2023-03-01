package com.Bachs.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Category")
public class CategoryEntity extends BaseEntity{
    @Column
    private String name;
    @Column
    private String code;
    @OneToMany(mappedBy = "categoryEntity")
    private List<NewsEntity> newsEntity;

    public CategoryEntity() {
    }

    public CategoryEntity(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<NewsEntity> getNewsEntity() {
        return newsEntity;
    }

    public void setNewsEntity(List<NewsEntity> newsEntity) {
        this.newsEntity = newsEntity;
    }
}
