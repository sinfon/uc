package com.heiha.sinfonia.uc.repository;

import com.heiha.sinfonia.uc.CheckUtil;
import com.heiha.sinfonia.uc.mapper.UserMapper;
import com.heiha.sinfonia.uc.po.User;
import com.heiha.sinfonia.uc.po.UserExample;
import com.heiha.sinfonia.uc.vo.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 14:13<br>
 * <b>Author:</b> heiha<br>
 */
@Repository
public class UserRepository {
    @Autowired
    private UserMapper userMapper;

    public User createUser(User user) {
        if (user.getNickName() == null) {
            user.setNickName(user.getUserName());
        }
        Date currentDate = new Date();
        user.setCreateTime(currentDate);
        user.setUpdateTime(currentDate);
        userMapper.insert(user);
        return user;
    }

    public List<User> listUser(UserQuery userQuery) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (CheckUtil.isNotNull(userQuery.getId()))
            criteria.andIdEqualTo(userQuery.getId());
        if (CheckUtil.isNotNull(userQuery.getUserId()))
            criteria.andUserIdEqualTo(userQuery.getUserId());
        if (CheckUtil.isNotEmpty(userQuery.getUserName()))
            criteria.andUserNameLike("%" + userQuery.getUserName() + "%");
        if (CheckUtil.isNotEmpty(userQuery.getNickName()))
            criteria.andNickNameLike("%" + userQuery.getNickName() + "%");
        if (CheckUtil.isNotEmpty(userQuery.getUserType()))
            criteria.andUserTypeEqualTo(userQuery.getUserType());
        if (CheckUtil.isNotEmpty(userQuery.getTel()))
            criteria.andTelLike("%" + userQuery.getTel() + "%");
        if (CheckUtil.isNotEmpty(userQuery.getEmail()))
            criteria.andEmailLike("%" + userQuery.getEmail() + "%");
        if (CheckUtil.isNotEmpty(userQuery.getRealName()))
            criteria.andRealNameLike("%" + userQuery.getRealName() + "%");
        if (CheckUtil.isNotNull(userQuery.getSex()))
            criteria.andSexEqualTo(userQuery.getSex());
        if (CheckUtil.isNotNull(userQuery.getBirthdayStart()))
            criteria.andBirthdayGreaterThanOrEqualTo(userQuery.getBirthdayStart());
        if (CheckUtil.isNotNull(userQuery.getBirthdayEnd()))
            criteria.andBirthdayLessThanOrEqualTo(userQuery.getBirthdayEnd());
        if (CheckUtil.isNotEmpty(userQuery.getIdNumber()))
            criteria.andIdNumberLike("%" + userQuery.getIdNumber() + "%");
        if (CheckUtil.isNotNull(userQuery.getParentId()))
            criteria.andParentIdEqualTo(userQuery.getParentId());
        if (CheckUtil.isNotNull(userQuery.getGroupId()))
            criteria.andGroupIdEqualTo(userQuery.getGroupId());
        if (CheckUtil.isNotNull(userQuery.getCreateUserId()))
            criteria.andCreateUserIdEqualTo(userQuery.getCreateUserId());
        if (CheckUtil.isNotNull(userQuery.getCreateTimeStart()))
            criteria.andCreateTimeGreaterThanOrEqualTo(userQuery.getCreateTimeStart());
        if (CheckUtil.isNotNull(userQuery.getCreateTimeEnd()))
            criteria.andCreateTimeLessThanOrEqualTo(userQuery.getCreateTimeEnd());
        if (CheckUtil.isNotNull(userQuery.getUpdateUserId()))
            criteria.andUpdateUserIdEqualTo(userQuery.getUpdateUserId());
        if (CheckUtil.isNotNull(userQuery.getUpdateTimeStart()))
            criteria.andUpdateTimeGreaterThanOrEqualTo(userQuery.getUpdateTimeStart());
        if (CheckUtil.isNotNull(userQuery.getUpdateTimeEnd()))
            criteria.andUpdateTimeLessThanOrEqualTo(userQuery.getUpdateTimeEnd());
        if (CheckUtil.isNotEmpty(userQuery.getNote()))
            criteria.andNoteLike("%" + userQuery.getNote() + "%");
        example.setOrderByClause("id desc");
        int page = userQuery.getPage();
        int numPerPage = userQuery.getNumPerPage();
        example.setLimitClause((page - 1) * numPerPage, numPerPage);
        return userMapper.selectByExample(example);
    }

    public Long countUser(UserQuery userQuery) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (CheckUtil.isNotNull(userQuery.getId()))
            criteria.andIdEqualTo(userQuery.getId());
        if (CheckUtil.isNotNull(userQuery.getUserId()))
            criteria.andUserIdEqualTo(userQuery.getUserId());
        if (CheckUtil.isNotEmpty(userQuery.getUserName()))
            criteria.andUserNameLike("%" + userQuery.getUserName() + "%");
        if (CheckUtil.isNotEmpty(userQuery.getNickName()))
            criteria.andNickNameLike("%" + userQuery.getNickName() + "%");
        if (CheckUtil.isNotEmpty(userQuery.getUserType()))
            criteria.andUserTypeEqualTo(userQuery.getUserType());
        if (CheckUtil.isNotEmpty(userQuery.getTel()))
            criteria.andTelLike("%" + userQuery.getTel() + "%");
        if (CheckUtil.isNotEmpty(userQuery.getEmail()))
            criteria.andEmailLike("%" + userQuery.getEmail() + "%");
        if (CheckUtil.isNotEmpty(userQuery.getRealName()))
            criteria.andRealNameLike("%" + userQuery.getRealName() + "%");
        if (CheckUtil.isNotNull(userQuery.getSex()))
            criteria.andSexEqualTo(userQuery.getSex());
        if (CheckUtil.isNotNull(userQuery.getBirthdayStart()))
            criteria.andBirthdayGreaterThanOrEqualTo(userQuery.getBirthdayStart());
        if (CheckUtil.isNotNull(userQuery.getBirthdayEnd()))
            criteria.andBirthdayLessThanOrEqualTo(userQuery.getBirthdayEnd());
        if (CheckUtil.isNotEmpty(userQuery.getIdNumber()))
            criteria.andIdNumberLike("%" + userQuery.getIdNumber() + "%");
        if (CheckUtil.isNotNull(userQuery.getParentId()))
            criteria.andParentIdEqualTo(userQuery.getParentId());
        if (CheckUtil.isNotNull(userQuery.getGroupId()))
            criteria.andGroupIdEqualTo(userQuery.getGroupId());
        if (CheckUtil.isNotNull(userQuery.getCreateUserId()))
            criteria.andCreateUserIdEqualTo(userQuery.getCreateUserId());
        if (CheckUtil.isNotNull(userQuery.getCreateTimeStart()))
            criteria.andCreateTimeGreaterThanOrEqualTo(userQuery.getCreateTimeStart());
        if (CheckUtil.isNotNull(userQuery.getCreateTimeEnd()))
            criteria.andCreateTimeLessThanOrEqualTo(userQuery.getCreateTimeEnd());
        if (CheckUtil.isNotNull(userQuery.getUpdateUserId()))
            criteria.andUpdateUserIdEqualTo(userQuery.getUpdateUserId());
        if (CheckUtil.isNotNull(userQuery.getUpdateTimeStart()))
            criteria.andUpdateTimeGreaterThanOrEqualTo(userQuery.getUpdateTimeStart());
        if (CheckUtil.isNotNull(userQuery.getUpdateTimeEnd()))
            criteria.andUpdateTimeLessThanOrEqualTo(userQuery.getUpdateTimeEnd());
        if (CheckUtil.isNotEmpty(userQuery.getNote()))
            criteria.andNoteLike("%" + userQuery.getNote() + "%");
        return userMapper.countByExample(example);
    }

    public User getUser(Integer userId) {
        UserExample example = new UserExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return userMapper.selectByExample(example).get(0);
    }
}
