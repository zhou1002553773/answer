package com.answer.framework.userInfo.service.impl;

import com.alibaba.fastjson.JSON;
import com.answer.framework.common.config.ConfigConstant;
import com.answer.framework.userInfo.form.UserInfoResp;
import com.answer.framework.userInfo.mapper.UserInfoMapper;
import com.answer.framework.userInfo.model.UserInfo;
import com.answer.framework.userInfo.service.UserInfoService;
import com.answer.framework.util.MD5Utils;
import com.answer.framework.util.SerialNoUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 保存用户信息
     * @param record
     * @return
     * @throws Exception
     */
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

    /**
     * 根据userCode查询
     * @param userCode
     * @return
     * @throws Exception
     */
    @Override
    public UserInfoResp selectByUserCode(String userCode) throws Exception {
        return userInfoMapper.selectByUserCode(userCode);
    }

    /**
     * 根据账号密码查询
     * @param userInfo
     * @return
     * @throws Exception
     */
    @Override
    public UserInfoResp selectByAccount(UserInfo userInfo) throws Exception {
        String pass = MD5Utils.encodingMd5(userInfo.getUserLoginPassword(), userInfo.getUserLoginAccount());
        System.out.printf(pass);
        userInfo.setUserLoginPassword(pass);
        return userInfoMapper.selectByAccount(userInfo);
    }
}
