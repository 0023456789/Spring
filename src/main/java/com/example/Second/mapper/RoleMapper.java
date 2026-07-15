package com.example.Second.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.Second.dto.request.RoleRequest;
import com.example.Second.dto.response.RoleResponse;
import com.example.Second.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
