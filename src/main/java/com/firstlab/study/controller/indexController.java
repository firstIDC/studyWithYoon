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
            Model model) {

        msg = "111";
        msg2 = "222";
        msg3 = "333";


        model.addAttribute("msg", msg);
        model.addAttribute("msg2", msg2);
        model.addAttribute("msg3", msg3);

        return "index";
    }

}
