package com.Bachs.dto;

import javax.swing.*;
import java.util.List;

public class UserDTO extends BaseDTO {
    private Long roleId;
    private String userName;
    private String password;
    private String fullName;
    private Boolean status;
    private List<RoleDTO> roleDTO;

    public UserDTO() {
    }

    public UserDTO(Long roleId, String userName, String password, String fullName, Boolean status) {
        this.roleId = roleId;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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

    public List<RoleDTO> getRoleDTO() {
        return roleDTO;
    }

    public void setRoleDTO(List<RoleDTO> roleDTO) {
        this.roleDTO = roleDTO;
    }
}
