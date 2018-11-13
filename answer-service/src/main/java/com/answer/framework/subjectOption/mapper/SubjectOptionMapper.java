package com.answer.framework.subjectOption.mapper;

import com.answer.framework.subjectOption.model.SubjectOption;

public interface SubjectOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SubjectOption record);

    int insertSelective(SubjectOption record);

    SubjectOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SubjectOption record);

    int updateByPrimaryKey(SubjectOption record);
}