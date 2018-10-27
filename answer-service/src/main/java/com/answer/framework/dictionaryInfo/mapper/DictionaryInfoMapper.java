package com.answer.framework.dictionaryInfo.mapper;

import com.answer.framework.dictionaryInfo.model.DictionaryInfo;

import java.util.List;

public interface DictionaryInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DictionaryInfo record);

    int insertSelective(DictionaryInfo record);

    DictionaryInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DictionaryInfo record);

    int updateByPrimaryKey(DictionaryInfo record);

    List<DictionaryInfo> listByDictTypeCode(String dictTypeCode);
}