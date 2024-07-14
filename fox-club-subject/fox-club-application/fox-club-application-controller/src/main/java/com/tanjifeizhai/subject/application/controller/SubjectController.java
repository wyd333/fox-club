package com.tanjifeizhai.subject.application.controller;

import com.tanjifeizhai.subject.infra.basic.entity.SubjectCategory;
import com.tanjifeizhai.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description: 刷题Controller
 * User: 12569
 * Date: 2024-07-12
 * Time: 22:09
 */

@RestController
public class SubjectController {
    @Resource
    private SubjectCategoryService subjectCategoryService;
    @GetMapping("/test")
    public String test(){
        SubjectCategory subjectCategory = subjectCategoryService.queryById(1L);
        return subjectCategory.getCategoryName();
    }
}
