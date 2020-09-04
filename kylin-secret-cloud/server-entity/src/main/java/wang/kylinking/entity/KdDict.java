package wang.kylinking.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @program: wang.kylinking.entity
 * @description: MySQL-secret库-kd_dict字典表实体类
 * @author: Kylin
 * @create: 2020-09-03 09:45
 * @Version: 1.0.0
 **/
@Data
public class KdDict implements Serializable {

    private static final long serialVersionUID = 2L;

    private String dictId;

    private String type;

    private String desc;

    private String code;

    private String details;

    private String parentDictId;

    private Integer dictStatus;

    private LocalDateTime createDate;

    private String createBy;

    private LocalDateTime updateDate;

    private String updateBy;
}
