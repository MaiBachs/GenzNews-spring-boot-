package com.Bachs.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="User")
public class UserEntity extends BaseEntity{
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String fullName;
    @Column
    private Boolean status;
    @Column
    private Long roleId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role")
    private List<RoleEntity> roleEntity;

    public UserEntity() {
    }

    public UserEntity(Long roleId, String userName, String password, String fullName, Boolean status) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<RoleEntity> getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(List<RoleEntity> roleEntity) {
        this.roleEntity = roleEntity;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
