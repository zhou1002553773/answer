package com.answer.framework.dictionaryInfo.service.impl;

import com.answer.framework.dictionaryInfo.mapper.DictionaryInfoMapper;
import com.answer.framework.dictionaryInfo.model.DictionaryInfo;
import com.answer.framework.dictionaryInfo.service.DictionaryInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryInfoImpl implements DictionaryInfoService {

    private static final Logger logger = LoggerFactory.getLogger(DictionaryInfoImpl.class);

    @Autowired
    private DictionaryInfoMapper dictionaryInfoMapper;

    @Override
    public List<DictionaryInfo> listByDictTypeCode(String dictTypeCode) {
        logger.info("查询接到的数据 ： {}",dictTypeCode);
        return dictionaryInfoMapper.listByDictTypeCode(dictTypeCode);
    }
}
