package com.study.mvc20220927oh.controller;

import com.study.mvc20220927oh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired // 생성자주입방법? 방식?
    @Qualifier("ts1") // 불러올 IoC 컨테이너 지정
    private TestService testService;

    @GetMapping("/test")
    public String run() {
        testService.logic1();
        return "DI_IoC 수업";
    }
}
