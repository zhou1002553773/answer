package com.answer.framework.userInfo.service.impl;

import com.answer.framework.common.config.ConfigConstant;
import com.answer.framework.userInfo.form.UserInfoRespVO;
import com.answer.framework.userInfo.mapper.UserInfoMapper;
import com.answer.framework.userInfo.model.UserInfo;
import com.answer.framework.userInfo.service.UserInfoService;
import com.answer.framework.util.MD5Utils;
import com.answer.framework.util.SerialNoUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public String saveUserInfo(UserInfo record) throws Exception{
        String userCode = "User" + SerialNoUtils.getSerialNo();
        record.setUserCode(userCode);
        record.setUserLoginPassword(MD5Utils.encodingMd5(record.getUserLoginPassword(),record.getUserLoginAccount()));
        record.setCreateTime(new Date());
        record.setUserStatus(ConfigConstant.USER_STATUS_NORMAL);
        userInfoMapper.insertSelective(record);
        return userCode;
    }

    @Override
    public UserInfoRespVO selectByUserCode(String userCode) throws Exception {
        return userInfoMapper.selectByUserCode(userCode);
    }

    @Override
    public UserInfoRespVO selectByAccount(UserInfo userInfo) throws Exception {
        String pass = MD5Utils.encodingMd5(userInfo.getUserLoginPassword(), userInfo.getUserLoginAccount());
        System.out.printf(pass);
        userInfo.setUserLoginPassword(pass);
        return userInfoMapper.selectByAccount(userInfo);
    }

}
