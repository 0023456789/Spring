package com.example.Second.mapper;


import com.example.Second.dto.request.UserCreationRequest;
import com.example.Second.dto.request.UserUpdateRequest;
import com.example.Second.dto.response.UserResponse;
import com.example.Second.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
