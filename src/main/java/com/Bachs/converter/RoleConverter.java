package com.Bachs.converter;

import com.Bachs.dto.RoleDTO;
import com.Bachs.entity.RoleEntity;

import java.util.ArrayList;
import java.util.List;

public class RoleConverter {
    public static RoleDTO toRoleDTO(RoleEntity roleEntity){
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setCode(roleEntity.getCode());
        roleDTO.setName(roleEntity.getName());
        roleDTO.setId(roleEntity.getId());
        roleDTO.setCreatedBy(roleEntity.getCreatedBy());
        roleDTO.setCreatedDate(roleEntity.getCreatedDate());
        return  roleDTO;
    }
    public static RoleEntity toRoleEntity(RoleDTO roleDTO){
        RoleEntity roleEntity = new RoleEntity();
        if(roleDTO.getId() != null){
            roleEntity.setId(roleDTO.getId());
            roleEntity.setCreatedBy(roleDTO.getCreatedBy());
            roleEntity.setCreatedDate(roleDTO.getCreatedDate());
        }
        roleEntity.setCode(roleDTO.getCode());
        roleEntity.setName(roleDTO.getName());
        return roleEntity;
    }
    public static List<RoleDTO> toRoleDTOList (List<RoleEntity> roleEntityList){
        List<RoleDTO> roleDTOList = new ArrayList<RoleDTO>();
        for(RoleEntity roleEntity: roleEntityList){
            roleDTOList.add(toRoleDTO(roleEntity));
        }
        return roleDTOList;
    }
    public static List<RoleEntity> toRoleEnittyList (List<RoleDTO> roleDTOList){
        List<RoleEntity> roleEntityList = new ArrayList<RoleEntity>();
        for(RoleDTO roleDTO : roleDTOList){
            roleEntityList.add(toRoleEntity(roleDTO));
        }
        return roleEntityList;
    }
}
