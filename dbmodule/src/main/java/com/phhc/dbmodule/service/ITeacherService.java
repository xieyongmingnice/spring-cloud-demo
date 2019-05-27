package com.phhc.dbmodule.service;

import com.phhc.dbmodule.controller.TeacherController;
import com.phhc.dbmodule.dao.jpa.TeacherRepository;
import com.phhc.dbmodule.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
public interface ITeacherService {


    int addTeacher(Teacher teacher);

}
