package com.answer.framework.subjectInfo.form;

import com.answer.framework.subjectInfo.model.SubjectInfo;

public class SubjectInfoResp extends SubjectInfo {

    private String subjectProviderName;

    public SubjectInfoResp() {
    }

    public String getSubjectProviderName() {
        return subjectProviderName;
    }

    public void setSubjectProviderName(String subjectProviderName) {
        this.subjectProviderName = subjectProviderName;
    }
}
