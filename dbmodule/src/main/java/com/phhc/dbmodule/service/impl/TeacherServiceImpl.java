package com.phhc.dbmodule.service.impl;

import com.phhc.dbmodule.entity.Teacher;
import com.phhc.dbmodule.dao.jpa.TeacherRepository;
import com.phhc.dbmodule.service.ITeacherService;
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
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public int addTeacher(Teacher teacher) {
         teacherRepository.save(teacher);
         return 0;
    }

    @Override
    public int deleteUserById(Integer id) {
        teacherRepository.deleteById(id);
        return 0;
    }

    @Override
    public int updateUserById(Teacher teacher) {
        teacherRepository.save(teacher);
        return 0;
    }

    @Override
    public List queryAll() {
        return teacherRepository.findAll();
    }
}
