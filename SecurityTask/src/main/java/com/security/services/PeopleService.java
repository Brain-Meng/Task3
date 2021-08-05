package com.security.services;

import com.security.pojo.People;

import java.util.List;
import java.util.Optional;

/**
 * @Topic
 * @Date 2021/08/04 14:07
 */
public interface PeopleService {
    /**
     * 根据姓名模糊查询
     * @param name
     * @return People
     */
    List<People> findByNameLike(String name);

    /**
     * 查询所有的信息
     * @return  List
     */
    List<People> selectAll();

    /**
     * 根据id进行删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 添加新人
     * @param people
     */
    void addNew(People people);
    /**
     * 通过id查询
     */
    People selectById(Integer id);
}
