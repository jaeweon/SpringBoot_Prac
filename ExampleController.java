package com.example.ex02prac.controller;

import com.example.ex02prac.domain.vo.ExampleVO;
import com.example.ex02prac.domain.vo.StudentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ex/*")
@Slf4j
public class ExampleController {

    @RequestMapping("example")
    public void ex01(){
        log.info("ex01.....................");
    }

    @GetMapping("ex02")
    public void ex02(){
        log.info("ex02......................");
    }

    @GetMapping("ex03")
    public void ex03(ExampleVO exampleVO){
        log.info("--------------------");
        log.info(exampleVO.toString());
        log.info("--------------------");
    }

    @GetMapping("ex04")
    public void ex04(StudentVO studentVO){
        log.info("----------------------");
        log.info(studentVO.toString());
        log.info("----------------------");
    }

    @GetMapping("ex05")
    public String ex05(StudentVO studentVO){
        log.info("----------------------");
        log.info(studentVO.toString());
        log.info("----------------------");

        int total = studentVO.getKorean() + studentVO.getEnglish() + studentVO.getMath();
        double avg = total / 3.0;
        studentVO.setTotal(total);
        studentVO.setAvg(Double.parseDouble(String.format("%.2f", avg)));
        return "ex05";
    }
}