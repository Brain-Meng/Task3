package com.security.services;
import com.security.dao.RoleRepository;
import com.security.pojo.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;
    /**
     *  查询role表中信息
     */
    public List<Role> findAll(){

        return roleRepository.findAll();
    }

}