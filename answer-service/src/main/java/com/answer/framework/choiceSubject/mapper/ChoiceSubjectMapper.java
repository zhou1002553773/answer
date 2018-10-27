package com.answer.framework.choiceSubject.mapper;

import com.answer.framework.choiceSubject.form.ChoiceSubjectReq;
import com.answer.framework.choiceSubject.form.ChoiceSubjectResp;
import com.answer.framework.choiceSubject.model.ChoiceSubject;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface ChoiceSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChoiceSubject record);

    int insertSelective(ChoiceSubject record);

    ChoiceSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ChoiceSubject record);

    int updateByPrimaryKey(ChoiceSubject record);

    PageList<ChoiceSubjectResp> listByObj(ChoiceSubjectReq choiceSubjectReq, PageBounds pageBounds);
}