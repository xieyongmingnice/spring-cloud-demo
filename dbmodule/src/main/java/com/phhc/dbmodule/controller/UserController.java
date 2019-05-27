package com.phhc.dbmodule.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.phhc.dbmodule.entity.User;
import com.phhc.dbmodule.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
@RestController
@RequestMapping("/dbmodule/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/selectUserByPage")
    public String queryUser(){

        Page<User> userPage=new Page<>();
        userPage.setSize(5);
        userPage.setCurrent(1);
        List list=userService.queryUser(userPage);

        return list.toString();
    }

    @RequestMapping(value = "/addUser")
    public String addUser(){

        for(int i=1;i<=50;i++){
            User user=new User();
            user.setUserId(10000+i);
            user.setUserName("用户名"+i);
            user.setPassword("password"+i);
            userService.insert(user);
        }

        return "OK";
    }


}

