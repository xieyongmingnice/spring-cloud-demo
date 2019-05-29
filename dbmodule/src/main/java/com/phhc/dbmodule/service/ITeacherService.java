package com.phhc.dbmodule.service;

import com.phhc.dbmodule.entity.Teacher;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
public interface ITeacherService {


    /**
     * 新增
     * @param teacher
     * @return
     */
    int addTeacher(Teacher teacher);

    /**
     * 删
     * @param id
     * @return
     */
    int deleteUserById(Integer id);

    /**
     * 改
     * @param teacher
     * @return
     */
    int updateUserById(Teacher teacher);
    /**
     * 查询
     * @return
     */
    List queryAll();

}
