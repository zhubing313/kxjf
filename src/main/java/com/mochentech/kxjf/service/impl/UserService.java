package com.mochentech.kxjf.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mochentech.kxjf.entity.User;
import com.mochentech.kxjf.mapper.UserMapper;
import com.mochentech.kxjf.service.IUserService;


import java.util.List;

@Service
public class UserService extends ServiceImpl<UserMapper,User> implements IUserService {
    @Override
    public List<User> findAll() {
        return baseMapper.findAll();
    }
}
