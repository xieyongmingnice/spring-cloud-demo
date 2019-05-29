package com.phhc.dbmodule.dao.mybatis;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.phhc.dbmodule.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
@Mapper
@Component(value = "userMapper")
public interface UserMapper extends BaseMapper<User> {

    IPage<User> selectUser(Page page);

    List<User> selectUser();

}
