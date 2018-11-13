package com.answer.framework.plantform.subjectInfo.controller;


import com.answer.framework.common.JsonResult;
import com.answer.framework.common.config.ConfigConstant;
import com.answer.framework.common.controller.AbstractController;
import com.answer.framework.subjectInfo.model.SubjectInfo;
import com.answer.framework.subjectInfo.service.SubjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("subjectInfo")
public class SubjectInfoController extends AbstractController {

    @Autowired
    private SubjectInfoService subjectInfoService;

    @RequestMapping("addSubjectInfo")
    public JsonResult addSubjectInfo(@RequestBody SubjectInfo subjectInfo){
        try{
            if(subjectInfo == null){
                return getJson("参数缺失", ERROR,"", ConfigConstant.REQUEST_ERROR_CODE_0001);
            }
            String subjectCode = subjectInfoService.insertSelective(subjectInfo);
            return getJson("新增成功", SUCCESS, subjectCode);
        }catch (Exception e){
            e.printStackTrace();
            return getJson("新增失败", ERROR, "");
        }
    }

    @RequestMapping("updateBySubjectCode")
    public JsonResult updateBySubjectCode(@RequestBody SubjectInfo subjectInfo){
        try{
            if(subjectInfo == null){
                return getJson("参数缺失", ERROR,"", ConfigConstant.REQUEST_ERROR_CODE_0001);
            }
            String subjectCode = subjectInfoService.updateBySubjectCode(subjectInfo);
            return getJson("更新成功", SUCCESS, subjectCode);
        }catch (Exception e){
            e.printStackTrace();
            return getJson("更新失败", ERROR, "");
        }
    }
}
