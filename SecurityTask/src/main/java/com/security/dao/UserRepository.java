package com.security.dao;

import com.security.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 通过id查找用户
     */
    User findUserByUsername(String username);

}
