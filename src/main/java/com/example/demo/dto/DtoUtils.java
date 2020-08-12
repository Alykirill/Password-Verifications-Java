package com.example.demo.dto;
import com.example.demo.UserEntity;
import org.modelmapper.ModelMapper;

public class DtoUtils {
    public static ModelMapper mapper = null;

    public static synchronized ModelMapper getModelMapper() {
        if (mapper == null) mapper = new ModelMapper();
        return mapper;
    }

    public static UserEntity toEntity(UserDto user) {
        return getModelMapper().map(user, UserEntity.class);
    }
}
