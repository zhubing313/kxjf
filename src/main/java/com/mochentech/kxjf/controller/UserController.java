package com.mochentech.kxjf.controller;


import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mochentech.kxjf.entity.User;
import com.mochentech.kxjf.service.IUserService;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/find")
    public String findAll(){
        List<User> userList = userService.findAll();
        String result = JSON.toJSONStringWithDateFormat(userList, "yyyy-MM-dd HH:mm:ss");
        System.out.println(result.toString());
        return result;
    }

}
