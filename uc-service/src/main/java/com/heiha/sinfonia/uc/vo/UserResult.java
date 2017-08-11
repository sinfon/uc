package com.heiha.sinfonia.uc.vo;

import com.heiha.sinfonia.uc.po.User;
import com.heiha.sinfonia.uc.pojo.Pagination;
import lombok.Data;

import java.util.List;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/10 14:52<br>
 * <b>Author:</b> heiha<br>
 */
@Data
public class UserResult {
    private List<User> users;
    private Pagination pagination;
}
