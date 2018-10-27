package com.answer.framework.choiceSubject.model;

import java.util.Date;

public class ChoiceSubject {
    private Long id;

    private String subjectCode;

    private String subjectContent;

    private String subjectCorrect;

    private String subjectType;

    private Integer subjectLevel;

    private String subjectProvider;

    private String subjectPurposeCode;

    private Date subjectCreateTime;

    private Date subjectUpdateTime;

    private String subjectStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode == null ? null : subjectCode.trim();
    }

    public String getSubjectContent() {
        return subjectContent;
    }

    public void setSubjectContent(String subjectContent) {
        this.subjectContent = subjectContent == null ? null : subjectContent.trim();
    }

    public String getSubjectCorrect() {
        return subjectCorrect;
    }

    public void setSubjectCorrect(String subjectCorrect) {
        this.subjectCorrect = subjectCorrect == null ? null : subjectCorrect.trim();
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType == null ? null : subjectType.trim();
    }

    public Integer getSubjectLevel() {
        return subjectLevel;
    }

    public void setSubjectLevel(Integer subjectLevel) {
        this.subjectLevel = subjectLevel;
    }

    public String getSubjectProvider() {
        return subjectProvider;
    }

    public void setSubjectProvider(String subjectProvider) {
        this.subjectProvider = subjectProvider == null ? null : subjectProvider.trim();
    }

    public String getSubjectPurposeCode() {
        return subjectPurposeCode;
    }

    public void setSubjectPurposeCode(String subjectPurposeCode) {
        this.subjectPurposeCode = subjectPurposeCode == null ? null : subjectPurposeCode.trim();
    }

    public Date getSubjectCreateTime() {
        return subjectCreateTime;
    }

    public void setSubjectCreateTime(Date subjectCreateTime) {
        this.subjectCreateTime = subjectCreateTime;
    }

    public Date getSubjectUpdateTime() {
        return subjectUpdateTime;
    }

    public void setSubjectUpdateTime(Date subjectUpdateTime) {
        this.subjectUpdateTime = subjectUpdateTime;
    }

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus == null ? null : subjectStatus.trim();
    }
}