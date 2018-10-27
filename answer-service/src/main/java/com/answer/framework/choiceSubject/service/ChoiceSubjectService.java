package com.answer.framework.choiceSubject.service;

import com.answer.framework.choiceSubject.form.ChoiceSubjectReq;
import com.answer.framework.choiceSubject.form.ChoiceSubjectResp;
import com.answer.framework.choiceSubject.model.ChoiceSubject;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface ChoiceSubjectService {

    String insertSelective(ChoiceSubject choiceSubject);

    PageList<ChoiceSubjectResp> listByObj(ChoiceSubjectReq choiceSubjectReq, PageBounds pageBounds);
}
