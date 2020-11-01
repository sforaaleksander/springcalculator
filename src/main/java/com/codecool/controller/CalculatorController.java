package com.codecool.controller;

import com.codecool.model.Calculus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculatorController {

    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String calculator(HttpServletRequest request){
        return "form";
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public String calculate(HttpServletRequest request, Model model){
        model.addAttribute("result", Calculus.calculate(request));
        return "result";
    }
}
