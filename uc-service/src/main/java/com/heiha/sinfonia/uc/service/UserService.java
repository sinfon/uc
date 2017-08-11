package com.heiha.sinfonia.uc.service;

import com.heiha.sinfonia.uc.po.User;
import com.heiha.sinfonia.uc.vo.UserQuery;
import com.heiha.sinfonia.uc.vo.UserResult;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 13:03<br>
 * <b>Author:</b> heiha<br>
 */
public interface UserService {
    User createUser(User user);
    UserResult listUser(UserQuery userQuery);
    User getUser(Integer userId);
}
