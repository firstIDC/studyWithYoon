package com.firstlab.study.controller;

import com.firstlab.study.dto.QuestionForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @PostMapping("/interviewsheet/upload")
    public String interviewsheetUpload(
            QuestionForm questionForm,
            Model model) {

        System.out.println(questionForm);

        questionForm.setAge("서른 마흔 다섯살이다");
        questionForm.setHowPeng("예술적으로 가셨구만");
        questionForm.setHowGoni("내가 아는 타짜 중에 최고였어요");
        questionForm.setSpear("남조선 아새끼들 눈치가 얼마나 빠른데");
        questionForm.setEnd("오잉");


//        msg = "서른 마흔 다섯살이다";
//        msg2 = "예술적으로 가셨구만";
//        msg3 = "내가 아는 타짜 중에 최고였어요";
//        msg4 = "남조선 아새끼들 눈치가 얼마나 빠른데";
//        msg5 = "오잉";
//
        model.addAttribute("msg",questionForm.getAge());
        model.addAttribute("msg2",questionForm.getHowPeng());
        model.addAttribute("msg3",questionForm.getHowGoni());
        model.addAttribute("msg4",questionForm.getSpear());
        model.addAttribute("msg5",questionForm.getEnd());

        return "index";
}
}
