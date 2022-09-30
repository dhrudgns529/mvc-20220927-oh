package com.study.mvc20220927oh.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @ResponeBody + @Controller
public class UserTestRestApi {

    @GetMapping("/api/test/user/rest")
    public String getUserName() {
        return "홍길동";
    }
}
