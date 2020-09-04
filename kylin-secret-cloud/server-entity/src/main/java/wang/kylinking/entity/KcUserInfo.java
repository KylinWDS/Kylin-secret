package wang.kylinking.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @program: wang.kylinking.entity
 * @description: MySQL-secret库-kc_user_info用户表实体类
 * @author: Kylin
 * @create: 2020-09-03 09:32
 * @Version: 1.0.0
 **/
@Data
public class KcUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;

    private Integer userType;

    private String loginName;

    private String nickName;

    private String password;

    private Integer userStatus;

    private LocalDateTime lastLogonTime;

    private LocalDateTime createDate;

    private String createBy;

    private LocalDateTime updateDate;

    private String updateBy;
}
