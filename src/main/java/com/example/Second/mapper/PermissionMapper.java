package com.example.Second.mapper;

import com.example.Second.dto.request.PermissionRequest;
import com.example.Second.dto.response.PermissionResponse;
import com.example.Second.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
