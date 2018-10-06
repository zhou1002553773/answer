package com.answer.framework.platform.userInfo.controller;

import com.alibaba.fastjson.JSON;
import com.answer.framework.common.JsonResult;
import com.answer.framework.common.config.ConfigConstant;
import com.answer.framework.common.controller.AbstractController;
import com.answer.framework.userInfo.form.UserInfoRespVO;
import com.answer.framework.userInfo.model.UserInfo;
import com.answer.framework.userInfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userInfo")
public class UserInfoController extends AbstractController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("save")
    public JsonResult save(@RequestBody UserInfo userInfo){
        try{
            if(userInfo == null){
                return getJson("参数缺失", ERROR,"", ConfigConstant.REQUEST_ERROR_CODE_0001);
            }
            logger.info("保存接到的数据 [userInfo] " + JSON.toJSON(userInfo));
            String userCode = userInfoService.saveUserInfo(userInfo);
            return getJson("保存成功", SUCCESS, userCode);
        }catch (Exception e){
            e.printStackTrace();
            return getJson("保存失败", ERROR, "");
        }
    }

    @RequestMapping("selectByUserCode")
    public JsonResult selectByUserCode(String userCode){
        try {
            if(StringUtils.isEmpty(userCode)){
                return getJson("参数缺失", ERROR,"", ConfigConstant.REQUEST_ERROR_CODE_0001);
            }
            logger.info("查询接到的数据 userCode : {}" , userCode);
            UserInfoRespVO userInfoRespVO = userInfoService.selectByUserCode(userCode);
            if(userInfoRespVO != null){
                return getJson("查询成功", SUCCESS, userInfoRespVO);
            }else{
                return getJson("查询数据不存在", ERROR, userCode,ConfigConstant.REQUEST_ERROR_CODE_0002);
            }
        }catch (Exception e){
            e.printStackTrace();
            return getJson("查询失败", ERROR, "");
        }
    }

    @RequestMapping("selectByAccount")
    public JsonResult selectByAccount(@RequestBody UserInfo userInfo){
        try {
            if(userInfo == null){
                return getJson("参数缺失", ERROR,"", ConfigConstant.REQUEST_ERROR_CODE_0001);
            }
            logger.info("查询接到的数据 userCode : {}" , JSON.toJSON(userInfo));
            UserInfoRespVO userInfoRespVO = userInfoService.selectByAccount(userInfo);
            if(userInfoRespVO != null){
                return getJson("查询成功", SUCCESS, userInfoRespVO);
            }else{
                return getJson("账号或密码错误", ERROR, userInfoRespVO,ConfigConstant.REQUEST_ERROR_CODE_0002);
            }
        }catch (Exception e){
            e.printStackTrace();
            return getJson("查询失败", ERROR, "");
        }
    }



}
