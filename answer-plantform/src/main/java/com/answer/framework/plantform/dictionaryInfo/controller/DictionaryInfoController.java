package com.answer.framework.plantform.dictionaryInfo.controller;

import com.answer.framework.common.JsonResult;
import com.answer.framework.common.config.ConfigConstant;
import com.answer.framework.common.controller.AbstractController;
import com.answer.framework.dictionaryInfo.model.DictionaryInfo;
import com.answer.framework.dictionaryInfo.service.DictionaryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dictionaryInfo")
public class DictionaryInfoController extends AbstractController {

    @Autowired
    private DictionaryInfoService dictionaryInfoService;

    @RequestMapping("listByDictTypeCode")
    public JsonResult listByDictTypeCode(String dictTypeCode){
        try{
            if(StringUtils.isEmpty(dictTypeCode)){
                return getJson("参数缺失", ERROR,"", ConfigConstant.REQUEST_ERROR_CODE_0001);
            }
            List<DictionaryInfo> dictionaryInfos = dictionaryInfoService.listByDictTypeCode(dictTypeCode);
            return getJson("查询成功", SUCCESS, dictionaryInfos);
        }catch (Exception e){
            e.printStackTrace();
            return getJson("查询失败", ERROR, "");
        }
    }
}
