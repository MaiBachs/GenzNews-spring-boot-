package com.Bachs.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Role")
public class RoleEntity extends BaseEntity{
    @Column
    private String name;
    @Column
    private String code;
    @ManyToMany(mappedBy = "roleEntity")
    private List<UserEntity> userEntity;

    public RoleEntity() {
    }

    public RoleEntity(String name, String code) {
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

    public List<UserEntity> getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(List<UserEntity> userEntity) {
        this.userEntity = userEntity;
    }
}
