package com.answer.framework.subjectInfo.service;

import com.answer.framework.subjectInfo.form.SubjectInfoReq;
import com.answer.framework.subjectInfo.form.SubjectInfoResp;
import com.answer.framework.subjectInfo.model.SubjectInfo;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface SubjectInfoService {

    String insertSelective(SubjectInfo subjectInfo);

    String updateBySubjectCode(SubjectInfo subjectInfo);

    SubjectInfoResp selectBySubjectCode(String subjectCode);

    PageList<SubjectInfoResp> listByObj(SubjectInfoReq subjectInfoReq, PageBounds pageBounds);
}
