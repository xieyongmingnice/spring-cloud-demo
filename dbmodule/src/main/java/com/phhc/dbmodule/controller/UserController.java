package com.phhc.dbmodule.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.phhc.dbmodule.entity.User;
import com.phhc.dbmodule.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    /**
     * mybatis-plus:增
     * @return
     */
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

    /**
     * mybatis-plus:删
     * @return
     */
    @RequestMapping(value = "/deleteUserById")
    public String deleteUser(){
        userService.deleteUserById(10003);
        return "OK";
    }

    /**
     * mybatis-plus:改
     * @return
     */
    @RequestMapping(value = "/updateUserById")
    public String updateUser(){
        User user=new User();
        user.setUserId(10001);
        user.setUserName("狗蛋");
        user.setPassword("9999");
        userService.updateUserById(user);
        return "OK";
    }

    /**
     * mybatis-plus:查
     * @return
     */
    @RequestMapping(value = "/selectUserByPage")
    public String queryUser(){

        Page<User> userPage=new Page<>();
        userPage.setSize(5);
        userPage.setCurrent(1);
        List list=userService.queryUser(userPage);

        return list.toString();
    }

    /**
     * mybatis-plus:查
     * @return
     */
    @RequestMapping(value = "/queryAllUser")
    public String queryAllUser(){

        List list=userService.queryAllUser();

        return list.toString();
    }

    @RequestMapping(value = "/queryByIds")
    public String queryByIds(){
        List<Integer> list=new ArrayList<>();
        list.add(10001);
        list.add(10010);
        list.add(10020);
        list.add(10030);
        return userService.queryByIds(list).toString();
    }



}

