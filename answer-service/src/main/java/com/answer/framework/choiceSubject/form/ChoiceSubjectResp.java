package com.answer.framework.choiceSubject.form;

import com.answer.framework.choiceSubject.model.ChoiceSubject;

public class ChoiceSubjectResp extends ChoiceSubject {

    private String subjectProviderName;

    public ChoiceSubjectResp() {
    }

    public String getSubjectProviderName() {
        return subjectProviderName;
    }

    public void setSubjectProviderName(String subjectProviderName) {
        this.subjectProviderName = subjectProviderName;
    }
}
