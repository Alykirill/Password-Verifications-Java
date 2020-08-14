package com.example.demo.controller;

import com.example.demo.SaveResponse;
import com.example.demo.UserEntity;
import com.example.demo.UserService;
import com.example.demo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path="/")
    @ResponseBody
    public List<UserEntity> list() {
        return userService.list();
    }

    @PostMapping(path= "/saveUserPassword")
    @ResponseBody
    public SaveResponse create(@RequestBody UserDto user) {
        boolean isError = user.isError();
        if (!isError) {
            userService.saveOrUpdate(user);
        }
        SaveResponse saveResponse = new SaveResponse(
                isError,
                user.hasNumber(),
                user.correctLength(),
                user.hasRegularLetter(),
                user.hasUppercaseLetter()
        );
        return saveResponse;
    }

}
