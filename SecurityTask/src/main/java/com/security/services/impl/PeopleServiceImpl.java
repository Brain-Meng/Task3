package com.security.services.impl;

import com.security.dao.PeopleRepository;
import com.security.pojo.People;
import com.security.services.PeopleService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @Topic
 * @Date 2021/08/04 14:08
 */
@Service
public class PeopleServiceImpl implements PeopleService {
    /**
     * 向service层中注入PeopleDao
     */
    @Resource
    PeopleRepository peopleRepository;
    /**
     * 根据id查询
     * @param name
     * @return People
     */

    @Override
    public List<People> findByNameLike(String name) {
        return peopleRepository.findByNameLike(name);
    }

    /**
     * 查询所有的信息
     * @return  List
     */
    @Override
    public List<People> selectAll() {
        return peopleRepository.findAll();
    }
    /**
     * 根据id进行删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        peopleRepository.deleteById(id);
    }

    /**
     * 添加新人
     * @param people
     */
    @Override
    public void addNew(People people) {
        peopleRepository.save(people);
    }
    /**
     * 通过id查询
     */
    @Override
    public People selectById(Integer id) {
        return peopleRepository.getById(id);
    }
}
