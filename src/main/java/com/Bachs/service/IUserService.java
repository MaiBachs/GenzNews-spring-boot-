package com.Bachs.service;

import com.Bachs.dto.RoleDTO;
import com.Bachs.dto.UserDTO;

import java.util.List;

public interface IUserService {
    UserDTO save(UserDTO userDTO);
    List<UserDTO> views();
    List<UserDTO> delete(List<Long>  ids);
}
