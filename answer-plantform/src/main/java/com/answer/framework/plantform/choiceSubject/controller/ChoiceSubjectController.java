package com.answer.framework.plantform.choiceSubject.controller;

import com.answer.framework.choiceSubject.form.ChoiceSubjectReq;
import com.answer.framework.choiceSubject.form.ChoiceSubjectResp;
import com.answer.framework.choiceSubject.model.ChoiceSubject;
import com.answer.framework.choiceSubject.service.ChoiceSubjectService;
import com.answer.framework.common.JsonResult;
import com.answer.framework.common.config.ConfigConstant;
import com.answer.framework.common.controller.AbstractController;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("choiceSubject")
public class ChoiceSubjectController extends AbstractController {

    @Autowired
    private ChoiceSubjectService choiceSubjectService;

    @RequestMapping("addChoiceSubject")
    public JsonResult addChoiceSubject(@RequestBody ChoiceSubject choiceSubject){
        try{
            if(choiceSubject == null){
                return getJson("参数缺失", ERROR,"", ConfigConstant.REQUEST_ERROR_CODE_0001);
            }
            String subjectCode = choiceSubjectService.insertSelective(choiceSubject);
            return getJson("新增成功", SUCCESS, subjectCode);
        }catch (Exception e){
            e.printStackTrace();
            return getJson("新增失败", ERROR, "");
        }
    }

    @RequestMapping("listByObj")
    public JsonResult listByObj(@RequestBody ChoiceSubjectReq choiceSubjectReq){
        try{
            if(StringUtils.isEmpty(choiceSubjectReq.getSubjectType())){
                return getJson("参数缺失", ERROR,"", ConfigConstant.REQUEST_ERROR_CODE_0001);
            }
            Integer pageNumber = choiceSubjectReq.getPageNumber() == null ? 1 : choiceSubjectReq.getPageNumber();
            Integer pageSize = choiceSubjectReq.getPageSize() == null ? 20 : choiceSubjectReq.getPageSize();
            PageBounds pageBounds = new PageBounds(pageNumber,pageSize);
            PageList<ChoiceSubjectResp> choiceSubjectResps = choiceSubjectService.listByObj(choiceSubjectReq, pageBounds);
            return getJson("查询成功", SUCCESS, choiceSubjectResps);
        }catch (Exception e){
            e.printStackTrace();
            return getJson("查询失败", ERROR, "");
        }
    }
}
