package com.security.dao;

import com.security.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    /**
     * 显示role表中所有信息
     */
    @Override
    List<Role> findAll();
}
