package com.answer.framework.choiceOption.mapper;

import com.answer.framework.choiceOption.model.ChoiceOption;

public interface ChoiceOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChoiceOption record);

    int insertSelective(ChoiceOption record);

    ChoiceOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ChoiceOption record);

    int updateByPrimaryKey(ChoiceOption record);
}