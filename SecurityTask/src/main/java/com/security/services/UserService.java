package com.security.services;

import com.security.dao.UserRepository;
import com.security.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 实现框架内置UserDetailsService接口
 */
@Service
public class UserService implements UserDetailsService {

    @Resource
    private UserRepository userRepository;

    /**
     * 查询并判断是否满足条件
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);

        System.out.println(user.getUsername());
        if (user == null) {
            throw new UsernameNotFoundException("不存在该用户!");
        }
        return user;

    }


}