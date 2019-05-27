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

    List queryUser(Page page);

    int insert(User user);

}
