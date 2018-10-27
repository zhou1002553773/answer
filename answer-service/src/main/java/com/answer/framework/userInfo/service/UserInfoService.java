package com.answer.framework.userInfo.service;

import com.answer.framework.userInfo.form.UserInfoResp;
import com.answer.framework.userInfo.model.UserInfo;

public interface UserInfoService {

    String saveUserInfo(UserInfo record) throws Exception;

    UserInfoResp selectByUserCode(String userCode) throws Exception;

    UserInfoResp selectByAccount(UserInfo userInfo) throws Exception;

}
