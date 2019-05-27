package com.phhc.dbmodule.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.phhc.dbmodule.entity.User;
import com.phhc.dbmodule.dao.mybatis.UserMapper;
import com.phhc.dbmodule.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List queryUser(Page page) {
        IPage iPage=userMapper.selectUser(page);
        List list=iPage.getRecords();
        return list;
    }

    @Override
    public int insert(User user) {
        userMapper.insert(user);
        return 0;
    }
}
