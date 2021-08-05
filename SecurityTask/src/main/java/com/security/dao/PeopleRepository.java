package com.security.dao;

import com.security.pojo.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Topic
 * @Date 2021/08/04 14:05
 */
@Component
public interface PeopleRepository extends JpaRepository<People,Integer> {

    /**
     * 自定义通过name模糊查询
     */
    @Query("select p from People p where p.people_name like CONCAT('%',:name,'%') ")
    List<People> findByNameLike(@Param("name") String name);

}
