package com.answer.framework.subjectInfo.mapper;

import com.answer.framework.subjectInfo.form.SubjectInfoReq;
import com.answer.framework.subjectInfo.form.SubjectInfoResp;
import com.answer.framework.subjectInfo.model.SubjectInfo;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface SubjectInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SubjectInfo record);

    int insertSelective(SubjectInfo record);

    SubjectInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SubjectInfo record);

    int updateByPrimaryKey(SubjectInfo record);

    int updateBySubjectCode(SubjectInfo record);

    SubjectInfoResp selectBySubjectCode(String subjectCode);

    PageList<SubjectInfoResp> listByObj(SubjectInfoReq subjectInfoReq, PageBounds pageBounds);
}