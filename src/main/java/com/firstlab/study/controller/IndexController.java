package com.firstlab.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @PostMapping("/interviewsheet/upload")
    public String interviewsheetUpload(Model model) {
        return "index";
    }
}

