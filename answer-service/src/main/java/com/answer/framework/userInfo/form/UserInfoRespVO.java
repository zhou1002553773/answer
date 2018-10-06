package com.answer.framework.userInfo.form;

import com.answer.framework.userInfo.model.UserInfo;

import java.util.List;

public class UserInfoRespVO extends UserInfo {

    private String userLogoPath;

    private String userWechatLogoPath;

    private List<String>  strings;

    public UserInfoRespVO() {
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

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
