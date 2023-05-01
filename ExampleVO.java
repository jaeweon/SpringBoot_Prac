package com.example.ex02prac.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ExampleVO {
    private String name;
    private Integer age;
    private String gender;

//    public String getGender(){
//        return "선택안함";
//    }

}
