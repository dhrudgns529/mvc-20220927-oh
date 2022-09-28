package com.study.mvc20220927oh.dto;

import lombok.*;

// lombok의 기능 getter, setter 등... 매번 변경해줄 필요 x, 편리
@NoArgsConstructor
@AllArgsConstructor
@Data // @ToString @Getter @Setter @EqualsAndHashCode
public class TestReqDto {
    private String strData;
    private String name;
    private int number;


}
