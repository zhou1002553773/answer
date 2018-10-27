package com.answer.framework.choiceSubject.service.impl;

import com.alibaba.fastjson.JSON;
import com.answer.framework.choiceSubject.form.ChoiceSubjectReq;
import com.answer.framework.choiceSubject.form.ChoiceSubjectResp;
import com.answer.framework.choiceSubject.mapper.ChoiceSubjectMapper;
import com.answer.framework.choiceSubject.model.ChoiceSubject;
import com.answer.framework.choiceSubject.service.ChoiceSubjectService;
import com.answer.framework.util.SerialNoUtils;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ChoiceSubjectServiceImpl implements ChoiceSubjectService {

    private static final Logger logger = LoggerFactory.getLogger(ChoiceSubjectServiceImpl.class);

    @Autowired
    private ChoiceSubjectMapper choiceSubjectMapper;

    @Override
    public String insertSelective(ChoiceSubject choiceSubject) {
        logger.info("新增接到的数据 ： {}" , JSON.toJSON(choiceSubject));
        String subjectCode = "SUBJECT" + SerialNoUtils.getSerialNo();
        choiceSubject.setSubjectCode(subjectCode);
        choiceSubject.setSubjectCreateTime(new Date());
        return subjectCode;
    }

    @Override
    public PageList<ChoiceSubjectResp> listByObj(ChoiceSubjectReq choiceSubjectReq, PageBounds pageBounds) {
        return choiceSubjectMapper.listByObj(choiceSubjectReq,pageBounds);
    }
}
