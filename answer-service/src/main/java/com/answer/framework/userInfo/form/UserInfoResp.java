package com.answer.framework.userInfo.form;

import com.answer.framework.userInfo.model.UserInfo;

import java.util.List;

public class UserInfoResp extends UserInfo {

    private String userLogoPath;

    private String userWechatLogoPath;

    public UserInfoResp() {
    }

    public String getUserLogoPath() {
        return userLogoPath;
    }

    public void setUserLogoPath(String userLogoPath) {
        this.userLogoPath = userLogoPath;
    }

    public String getUserWechatLogoPath() {
        return userWechatLogoPath;
    }

    public void setUserWechatLogoPath(String userWechatLogoPath) {
        this.userWechatLogoPath = userWechatLogoPath;
    }

}
