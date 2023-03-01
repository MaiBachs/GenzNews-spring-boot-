package com.Bachs.service.impl;

import com.Bachs.converter.UserConverter;
import com.Bachs.dto.RoleDTO;
import com.Bachs.dto.UserDTO;
import com.Bachs.entity.UserEntity;
import com.Bachs.repository.UserRepo;
import com.Bachs.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDTO save(UserDTO userDTO) {
        userRepo.save(UserConverter.toUserEntity(userDTO));
        return userDTO;
    }

    @Override
    public List<UserDTO> views() {
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        List<UserEntity> userEntityList = userRepo.findAll();
        for(UserEntity userEntity: userEntityList){
            userDTOList.add(UserConverter.touserDTO(userEntity));
        }
        return userDTOList;
    }

    @Override
    public List<UserDTO> delete(List<Long> ids) {
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        for(Long id: ids){
            userDTOList.add(UserConverter.touserDTO(userRepo.findById(id).orElse(null)));
            userRepo.deleteById(id);
        }
        return userDTOList;
    }
}
