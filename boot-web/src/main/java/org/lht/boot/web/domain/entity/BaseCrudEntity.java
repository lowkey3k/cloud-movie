package org.lht.boot.web.domain.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author LiHaitao
 * @description BaseCrudEntity:
 * @date 2020/1/2 15:42
 **/
@Data
public abstract class BaseCrudEntity<PK> implements Entity<PK> {

    @TableField(value = "status", fill = FieldFill.INSERT)
    private Integer status;

    @TableField(value = "creator_id", fill = FieldFill.INSERT)
    private String creatorId;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Long createTime;

    @TableField(value = "update_id", fill = FieldFill.UPDATE)
    private String updateId;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Long updateTime;

}
