package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.dto.DtoUtils;
import com.example.demo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;


    public List<UserEntity> list() {
        return repository.findAll();
    }

    public void saveOrUpdate(UserDto user) {
        UserEntity u = repository.findByUser(user.getUser());
        if (u != null) {
            u.setUser(user.getUser());
            u.setPassword(user.getPassword());
            repository.save(u);
            return;
        }
        repository.save(DtoUtils.toEntity(user));
    }

}
