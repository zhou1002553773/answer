package com.answer.framework.dictionaryInfo.model;

import java.util.Date;

public class DictionaryInfo {
    private Long id;

    private String dictTypeCode;

    private String dictTypeName;

    private String dictKeyCode;

    private String dictKeyValue;

    private String dictStatus;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode == null ? null : dictTypeCode.trim();
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName == null ? null : dictTypeName.trim();
    }

    public String getDictKeyCode() {
        return dictKeyCode;
    }

    public void setDictKeyCode(String dictKeyCode) {
        this.dictKeyCode = dictKeyCode == null ? null : dictKeyCode.trim();
    }

    public String getDictKeyValue() {
        return dictKeyValue;
    }

    public void setDictKeyValue(String dictKeyValue) {
        this.dictKeyValue = dictKeyValue == null ? null : dictKeyValue.trim();
    }

    public String getDictStatus() {
        return dictStatus;
    }

    public void setDictStatus(String dictStatus) {
        this.dictStatus = dictStatus == null ? null : dictStatus.trim();
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