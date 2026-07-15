package com.example.Second.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Second.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}
