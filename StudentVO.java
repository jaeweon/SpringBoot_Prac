package com.example.ex02prac.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StudentVO {
    private String name = "이재원";
    private Integer korean = 43;
    private Integer english = 80;
    private Integer math = 12;
    private Integer total;
    private double avg;
}
