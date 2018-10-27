package com.answer.framework.userInfo.mapper;

import com.answer.framework.userInfo.form.UserInfoResp;
import com.answer.framework.userInfo.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfoResp selectByUserCode(String userCode); // 根据userCode查询用户信息

    UserInfoResp selectByAccount(UserInfo userInfo); // 根据账号密码查询

}