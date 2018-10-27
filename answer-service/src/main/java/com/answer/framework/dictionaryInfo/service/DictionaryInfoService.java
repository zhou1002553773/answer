package com.answer.framework.dictionaryInfo.service;

import com.answer.framework.dictionaryInfo.model.DictionaryInfo;

import java.util.List;

public interface DictionaryInfoService {

    List<DictionaryInfo> listByDictTypeCode(String dictTypeCode);
}
