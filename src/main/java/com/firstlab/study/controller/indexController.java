package com.firstlab.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class indexController {

    @PostMapping("/interviewsheet/upload")
    public String interviewsheetUpload(
            @RequestParam(value = "msg") String msg,
            @RequestParam(value = "msg2") String msg2,
            @RequestParam(value = "msg3") String msg3,
            @RequestParam(value = "msg4") String msg4,
            @RequestParam(value = "msg5") String msg5,
            Model model) {

        msg = "서른 마흔 다섯살이다";
        msg2 = "예술적으로 가셨구만";
        msg3 = "내가 아는 타짜 중에 최고였어요";
        msg4 = "남조선 아새끼들 눈치가 얼마나 빠른데";
        msg5 = "오잉";

        model.addAttribute("msg",msg);
        model.addAttribute("msg2",msg2);
        model.addAttribute("msg3",msg3);
        model.addAttribute("msg4",msg4);
        model.addAttribute("msg5",msg5);

        return "index";
}
}
