package com.answer.framework.plantform.userInfo.controller;

import com.answer.framework.common.JsonResult;
import com.answer.framework.common.config.ConfigConstant;
import com.answer.framework.common.controller.AbstractController;
import com.answer.framework.userInfo.form.UserInfoResp;
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
            UserInfoResp userInfoResp = userInfoService.selectByUserCode(userCode);
            if(userInfoResp != null){
                return getJson("查询成功", SUCCESS, userInfoResp);
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
            UserInfoResp userInfoResp = userInfoService.selectByAccount(userInfo);
            if(userInfoResp != null){
                return getJson("查询成功", SUCCESS, userInfoResp);
            }else{
                return getJson("账号或密码错误", ERROR, "",ConfigConstant.REQUEST_ERROR_CODE_0002);
            }
        }catch (Exception e){
            e.printStackTrace();
            return getJson("查询失败", ERROR, "");
        }
    }



}
