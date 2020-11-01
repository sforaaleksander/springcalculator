package com.codecool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculatorController {

    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String calculator(HttpServletRequest request){
        return "form";
    }
}
