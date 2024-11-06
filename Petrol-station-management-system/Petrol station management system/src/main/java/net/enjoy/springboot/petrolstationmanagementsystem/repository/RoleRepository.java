package net.enjoy.springboot.petrolstationmanagementsystem.repository;

import net.enjoy.springboot.petrolstationmanagementsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}