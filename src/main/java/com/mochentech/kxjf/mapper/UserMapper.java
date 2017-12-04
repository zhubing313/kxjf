package com.mochentech.kxjf.mapper;

import com.mochentech.kxjf.SuperMapper;
import com.mochentech.kxjf.entity.User;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    List<User> findAll();

}