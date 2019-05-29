package com.phhc.dbmodule.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Liusc
 * @since 2019-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

private static final long serialVersionUID=1L;

    @TableId
    private Integer userId;

    private String userName;

    private String password;

}
