package com.answer.framework.choiceOption.model;

public class ChoiceOption {
    private Long id;

    private String optionCode;

    private String optionContent;

    private String subjectCode;

    private String optionScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode == null ? null : optionCode.trim();
    }

    public String getOptionContent() {
        return optionContent;
    }

    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent == null ? null : optionContent.trim();
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode == null ? null : subjectCode.trim();
    }

    public String getOptionScore() {
        return optionScore;
    }

    public void setOptionScore(String optionScore) {
        this.optionScore = optionScore == null ? null : optionScore.trim();
    }
}