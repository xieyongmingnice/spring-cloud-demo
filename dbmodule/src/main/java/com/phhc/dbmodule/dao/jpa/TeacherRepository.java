package com.phhc.dbmodule.dao.jpa;

import com.phhc.dbmodule.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
@Repository
public interface TeacherRepository extends
        Serializable,
        JpaRepository<Teacher, Integer> {

    Teacher findByTeacherIdAndTeacherName(int id,String name);
}
