package com.firstlab.study.controller;

import com.firstlab.study.dto.Jangform;
import com.firstlab.study.dto.QuestionForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @PostMapping("/interviewsheet/upload")
    public String interviewsheetUpload(
            Jangform jangForm,
            Model model) {

        System.out.println(jangForm);

        jangForm.setBibigo("코딱지");
        jangForm.setBibigo2("꺼져");

        model.addAttribute("msg",jangForm.getBibigo());
        model.addAttribute("msg2",jangForm.getBibigo2());


        return "index";
}
}
