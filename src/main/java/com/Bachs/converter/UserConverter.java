package com.Bachs.converter;

import com.Bachs.dto.UserDTO;
import com.Bachs.entity.UserEntity;

public class UserConverter {
    public static UserDTO touserDTO(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(userEntity.getUserName());
        userDTO.setId(userEntity.getId());
        userDTO.setFullName(userEntity.getFullName());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setRoleId(userEntity.getRoleId());
        userDTO.setStatus(userEntity.getStatus());
        userDTO.setCreatedBy(userEntity.getCreatedBy());
        userDTO.setCreatedDate(userEntity.getCreatedDate());
        userDTO.setRoleDTO(RoleConverter.toRoleDTOList(userEntity.getRoleEntity()));
        return userDTO;
    }
    public static UserEntity toUserEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        if (userDTO.getId() != null) {
            userEntity.setId(userDTO.getId());
            userEntity.setCreatedBy(userDTO.getCreatedBy());
            userEntity.setCreatedDate(userDTO.getCreatedDate());
        }
        userEntity.setUserName(userDTO.getUserName());
        userEntity.setFullName(userDTO.getFullName());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setRoleId(userDTO.getRoleId());
        userEntity.setRoleEntity(RoleConverter.toRoleEnittyList(userDTO.getRoleDTO()));
        return userEntity;
    }
}
