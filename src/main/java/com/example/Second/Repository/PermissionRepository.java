package com.example.Second.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Second.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
