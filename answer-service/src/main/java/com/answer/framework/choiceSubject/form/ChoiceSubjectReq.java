package com.answer.framework.choiceSubject.form;

import com.answer.framework.choiceSubject.model.ChoiceSubject;

public class ChoiceSubjectReq extends ChoiceSubject {

    private Integer pageNumber;

    private Integer pageSize;

    public ChoiceSubjectReq() {
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
