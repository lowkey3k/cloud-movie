package org.lht.boot.security.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.lht.boot.security.entity.Permission;
import org.lht.boot.security.entity.UserRole;
import org.lht.boot.web.domain.vo.AbstractVO;

/**
 * Description:
 *
 * @Author lht
 * @Date 2020/3/25 8:04 PM
 **/
@Data
@ApiModel("用户角色VO")
public class UserRoleVO extends AbstractVO<UserRole,Integer> {

    @TableId(type = IdType.AUTO)
    private Integer id;


    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("角色id")
    private Integer roleId;
}
