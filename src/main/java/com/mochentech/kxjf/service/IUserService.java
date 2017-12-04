package com.mochentech.kxjf.service;

import com.baomidou.mybatisplus.service.IService;
import com.mochentech.kxjf.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    public List<User> findAll();
}
