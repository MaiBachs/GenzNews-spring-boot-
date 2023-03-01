package com.Bachs.dto;

import java.util.Date;

public class BaseDTO {
    private Long id;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public BaseDTO() {
    }

    public BaseDTO(Long id, String createdBy, Date createDate, String modifiedBy, Date modifiDate) {
        this.id = id;
        this.createdBy = createdBy;
        this.createdDate = createDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getModifiedBy() {  return modifiedBy;}

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
