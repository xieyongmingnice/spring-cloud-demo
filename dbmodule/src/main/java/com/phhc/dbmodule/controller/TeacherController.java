package com.phhc.dbmodule.controller;

import com.phhc.dbmodule.entity.Teacher;
import com.phhc.dbmodule.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
@RestController
@RequestMapping("/dbmodule/teacher")
public class TeacherController {

    @Autowired
    ITeacherService teacherService;

    /**
     * jpa:增
     * @return
     */
    @RequestMapping(value = "/addOneTeacher")
    public String addTeacher(){

        Teacher teacher=new Teacher();
        teacher.setTeacherId(10001);
        teacher.setTeacherName("张三");
        teacher.setSubjectId(18);
        teacherService.addTeacher(teacher);
        return "OK";
    }

    /**
     * jpa:删
     * @return
     */
    @RequestMapping(value = "/deleteById")
    public String deleteTeacher(){

        int id=10002;
        teacherService.deleteUserById(id);
        return "OK";
    }

    /**
     * jpa:改
     * @return
     */
    @RequestMapping(value = "/updateById")
    public String updateTeacher(){

        Teacher teacher=new Teacher();
        teacher.setTeacherId(10001);
        teacher.setTeacherName("dodo");
        teacher.setSubjectId(18);
        teacherService.addTeacher(teacher);
        return "OK";
    }

    /**
     * jpa:查
     * @return
     */
    @RequestMapping(value="/queryAll")
    public String queryAll(){

        List list=teacherService.queryAll();

        return list.toString();
    }


}

