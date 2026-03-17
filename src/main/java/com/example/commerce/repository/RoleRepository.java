package com.example.commerce.repository;

import com.example.commerce.entity.user.Role;
import com.example.commerce.entity.user.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    Optional<Role> findByName(RoleName name);
}
