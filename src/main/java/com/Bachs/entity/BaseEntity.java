package com.Bachs.entity;

import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @LastModifiedBy
    private String modifiedBy;
    @Column
    @LastModifiedDate
    private Date modifiedDate;
    @Column
    @CreatedBy
    private  String createdBy;
    @Column
    @CreatedDate
    private  Date createdDate;

    public BaseEntity() {
    }

    public BaseEntity(Long id, String modifiedBY, Date modifiDate, String createdBy, Date createdDate) {
        this.id = id;
        this.modifiedBy = modifiedBY;
        this.modifiedDate = modifiDate;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBY) {
        this.modifiedBy = modifiedBY;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiDate) {
        this.modifiedDate = modifiDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
