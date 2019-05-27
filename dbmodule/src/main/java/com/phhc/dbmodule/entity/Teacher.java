package com.phhc.dbmodule.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * 
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
@Entity
@Table(name="teacher")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Teacher implements Serializable {

private static final long serialVersionUID=1L;

    @Id
    private Integer teacherId;

    private String teacherName;

    private Integer subjectId;


}
