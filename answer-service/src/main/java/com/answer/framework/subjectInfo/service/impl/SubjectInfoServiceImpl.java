package com.answer.framework.subjectInfo.service.impl;

import com.alibaba.fastjson.JSON;
import com.answer.framework.subjectInfo.form.SubjectInfoReq;
import com.answer.framework.subjectInfo.form.SubjectInfoResp;
import com.answer.framework.subjectInfo.mapper.SubjectInfoMapper;
import com.answer.framework.subjectInfo.model.SubjectInfo;
import com.answer.framework.subjectInfo.service.SubjectInfoService;
import com.answer.framework.util.SerialNoUtils;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class SubjectInfoServiceImpl implements SubjectInfoService {

    private static final Logger logger = LoggerFactory.getLogger(SubjectInfoServiceImpl.class);

    @Autowired
    private SubjectInfoMapper subjectInfoMapper;

    @Override
    public String insertSelective(SubjectInfo subjectInfo) {
        logger.info("新增接到的数据 ： {}", JSON.toJSON(subjectInfo));
        String subjectCode = "SUBJECT" + SerialNoUtils.getSerialNo();
        subjectInfo.setSubjectCode(subjectCode);
        subjectInfo.setSubjectCreateTime(new Date());
        subjectInfoMapper.insertSelective(subjectInfo);
        return subjectCode;
    }

    @Override
    public String updateBySubjectCode(SubjectInfo subjectInfo) {
        logger.info("更新接到的数据 ： {}", JSON.toJSON(subjectInfo));
        subjectInfoMapper.updateBySubjectCode(subjectInfo);
        return subjectInfo.getSubjectCode();
    }

    @Override
    public SubjectInfoResp selectBySubjectCode(String subjectCode) {
        logger.info("查询接到的数据 ： {}", subjectCode);
        SubjectInfoResp subjectInfoResp = subjectInfoMapper.selectBySubjectCode(subjectCode);
        return subjectInfoResp;
    }

    @Override
    public PageList<SubjectInfoResp> listByObj(SubjectInfoReq subjectInfoReq, PageBounds pageBounds) {
        return subjectInfoMapper.listByObj(subjectInfoReq,pageBounds);
    }


}
