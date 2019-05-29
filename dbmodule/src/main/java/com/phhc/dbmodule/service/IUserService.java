package com.phhc.dbmodule.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.phhc.dbmodule.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
public interface IUserService extends IService<User> {

    /**
     * mybatis-plus:增
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * mybatis-plus:删
     * @param id
     * @return
     */
    int deleteUserById(Integer id);

    /**
     * mybatis-plus:改
     * @return
     */
     int updateUserById(User user);

    /**
     * mybatis-plus:查
     * @param page
     * @return
     */
    List queryUser(Page page);

    List queryAllUser();
}
