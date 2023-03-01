package com.Bachs.api;

import com.Bachs.converter.UserConverter;
import com.Bachs.dto.UserDTO;
import com.Bachs.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserAPI {
    @Autowired
    private IUserService iUserService;
    @PostMapping(value = "/user")
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        return iUserService.save(userDTO);
    }
    @PutMapping(value = "/user")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return iUserService.save(userDTO);
    }
    @GetMapping(value = "/user")
    public List<UserDTO> getUser(){
        return iUserService.views();
    }
    @DeleteMapping(value = "/user")
    public List<UserDTO> deleteUser(@RequestBody  List<Long> ids){
        return iUserService.delete(ids);
    }
}
