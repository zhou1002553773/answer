package com.answer.framework.userInfo.mapper;

import com.answer.framework.userInfo.form.UserInfoRespVO;
import com.answer.framework.userInfo.model.UserInfo;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfoRespVO selectByUserCode(String userCode); // 根据userCode查询用户信息

    UserInfoRespVO selectByAccount(UserInfo userInfo); // 根据账号密码查询

}