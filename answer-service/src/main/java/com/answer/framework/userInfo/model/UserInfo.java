package com.answer.framework.userInfo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserInfo {
    private Long id;

    private String userCode;

    private String userName;

    private String userNickname;

    private String userAge;

    private String userGender;

    private String userMobile;

    private String userLogo;

    private String userLoginAccount;

    private String userLoginPassword;

    private String userWechatId;

    private String userWechatLogo;

    private String userEmail;

    private String userQq;

    private String userSinaMicroblog;

    private String userStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge == null ? null : userAge.trim();
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo == null ? null : userLogo.trim();
    }

    public String getUserLoginAccount() {
        return userLoginAccount;
    }

    public void setUserLoginAccount(String userLoginAccount) {
        this.userLoginAccount = userLoginAccount == null ? null : userLoginAccount.trim();
    }

    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword == null ? null : userLoginPassword.trim();
    }

    public String getUserWechatId() {
        return userWechatId;
    }

    public void setUserWechatId(String userWechatId) {
        this.userWechatId = userWechatId == null ? null : userWechatId.trim();
    }

    public String getUserWechatLogo() {
        return userWechatLogo;
    }

    public void setUserWechatLogo(String userWechatLogo) {
        this.userWechatLogo = userWechatLogo == null ? null : userWechatLogo.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    public String getUserSinaMicroblog() {
        return userSinaMicroblog;
    }

    public void setUserSinaMicroblog(String userSinaMicroblog) {
        this.userSinaMicroblog = userSinaMicroblog == null ? null : userSinaMicroblog.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}