package com.heiha.sinfonia.uc.service.impl;

import com.heiha.sinfonia.uc.po.User;
import com.heiha.sinfonia.uc.pojo.Pagination;
import com.heiha.sinfonia.uc.repository.UserRepository;
import com.heiha.sinfonia.uc.service.UserService;
import com.heiha.sinfonia.uc.vo.UserQuery;
import com.heiha.sinfonia.uc.vo.UserResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 17:44<br>
 * <b>Author:</b> heiha<br>
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    @Transactional
    @Override
    public UserResult listUser(UserQuery userQuery) {
        UserResult userResult = new UserResult();
        Pagination pagination = new Pagination();
        pagination.setPage(userQuery.getPage());
        pagination.setNumPerPage(userQuery.getNumPerPage());

        userResult.setUsers(userRepository.listUser(userQuery));
        pagination.setTotal(userRepository.countUser(userQuery));
        userResult.setPagination(pagination);

        return userResult;
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.getUser(userId);
    }
}
