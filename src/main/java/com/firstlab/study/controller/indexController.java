package com.firstlab.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class indexController {

    @GetMapping("/{boolean}")
    public String index(@PathVariable("boolean") String paramTrue, Model model) {

        Boolean isTrue = false;
        if (paramTrue.equals("true")) {
            isTrue = true;
        }

        //seolgiya hi

        Integer money = 1000;

        if (isTrue) {
            money = money + 500;
        } else {
            money = money + 300;
        }

        System.out.println(money);

        model.addAttribute("value", 1500);

        return "index";
    }

}
