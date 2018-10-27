package com.answer.framework.userInfo.form;

import com.answer.framework.userInfo.model.UserInfo;

public class UserInfoReq extends UserInfo {

    private String pageNumber;

    private String pageSize;

    public UserInfoReq() {
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }
}
