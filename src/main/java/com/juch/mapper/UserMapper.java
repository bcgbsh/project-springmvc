package com.juch.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Chen Jun
 * @Date 2021/7/7 17:15
 * @Description
 * @Since
 */
@Repository
public interface UserMapper {
    public List getAll();
}

