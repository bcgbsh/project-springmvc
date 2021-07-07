package com.juch.impl;

import com.juch.mapper.UserMapper;
import com.juch.service.UserServcice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Chen Jun
 * @Date 2021/7/7 17:18
 * @Description
 * @Since
 */
@Service
public class UserImpl implements UserServcice {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List getAll() {
        return userMapper.getAll();
    }
}
