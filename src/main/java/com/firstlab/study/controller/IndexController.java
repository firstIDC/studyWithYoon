package com.firstlab.study.controller;

import com.firstlab.study.dto.JangForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @PostMapping("/interviewsheet/upload")
    public String interviewsheetUpload(JangForm jangForm, Model model) {


        //plusMoney한테 100을 전달합니다.
        plusMoney(100);


        jangForm.setBibigo("코딱지");
        jangForm.setBibigo2("꺼져");

        model.addAttribute("msg", jangForm.getBibigo());
        model.addAttribute("msg2", jangForm.getBibigo2());

        return "index";
    }

    Integer plusMoney(Integer money) {
        money = money + 5;
        return money;
    }


    // Task
    // 문자열을 받아서, 받은 문자열 끝에 별을 추가해서 돌려주는 메소드를 만들어주세요.





}

