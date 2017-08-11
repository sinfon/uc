package com.heiha.sinfonia.uc.vo;

import com.heiha.sinfonia.uc.pojo.Pagination;
import lombok.Data;

import java.util.Date;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 14:20<br>
 * <b>Author:</b> heiha<br>
 */
@Data
public class UserQuery extends BaseQuery {
    private Integer id;

    private Integer userId;

    private String userName;

    private String nickName;

    private String password;

    private String userType;

    private String tel;

    private String email;

    private String realName;

    private Integer sex;

    private Date birthdayStart;

    private Date birthdayEnd;

    private String idNumber;

    private Integer parentId;

    private Integer groupId;
}
