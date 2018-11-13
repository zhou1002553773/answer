package com.answer.framework.subjectInfo.form;

import com.answer.framework.subjectInfo.model.SubjectInfo;

public class SubjectInfoReq extends SubjectInfo {

    private Integer pageNumber;

    private Integer pageSize;

    public SubjectInfoReq() {
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
