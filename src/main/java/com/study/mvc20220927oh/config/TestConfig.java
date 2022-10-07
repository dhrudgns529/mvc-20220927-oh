package com.study.mvc20220927oh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean // 라이브러리(@Component)를 달 수 없는 곳에는 이런 형태로 객체를 반환하면 IoC 컨테이너에 등록가능.
    public TestSetting testSetting() {
        return new TestSetting();
    }
}
