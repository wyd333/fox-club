package com.tanjifeizhai.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description: 刷题Controller
 * User: 12569
 * Date: 2024-07-12
 * Time: 22:09
 */

@RestController
public class SubjectController {
    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}
