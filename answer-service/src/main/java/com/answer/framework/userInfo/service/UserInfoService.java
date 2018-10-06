package com.answer.framework.userInfo.service;


import com.answer.framework.userInfo.form.UserInfoRespVO;
import com.answer.framework.userInfo.model.UserInfo;

public interface UserInfoService {

    String saveUserInfo(UserInfo record) throws Exception;

    UserInfoRespVO selectByUserCode(String userCode) throws Exception;

    UserInfoRespVO selectByAccount(UserInfo userInfo) throws Exception;
}
