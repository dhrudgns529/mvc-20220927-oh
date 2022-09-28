package com.study.mvc20220927oh.controller;

import com.study.mvc20220927oh.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    // crud => c - post / r - get / u - put / d - delete

    @GetMapping("/test1") // @GET매핑("/주소명") URI
    public String test1() {
        return "test_page1";
    }

    @ResponseBody // 헤더-정보 / 바디-데이터 값
    @GetMapping("/test1-1")
    public String test3() {
        return "test_page1";
    }

    @GetMapping("/test2") // @GET매핑("/주소명") URI
    public String test2() {
        System.out.println("test2");
        return "test/test_page2";
    }

    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto) {
        System.out.println(testReqDto);

        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("name", testReqDto.getName());
        model.addAttribute("number", testReqDto.getNumber());

        return "test/test_page4";
    }

}
