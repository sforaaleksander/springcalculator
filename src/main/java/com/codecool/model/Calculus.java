package com.codecool.model;

import javax.servlet.http.HttpServletRequest;

public class Calculus {
    public static String calculate(HttpServletRequest request) {
        int no1 = Integer.parseInt(request.getParameter("no1"));
        int no2 = Integer.parseInt(request.getParameter("no2"));
        int result = 0;
        switch (request.getParameter("operator")) {
            case "add":
                result = no1 + no2;
                break;
            case "subtract":
                result = no1 - no2;
                break;
            case "multiply":
                result = no1 * no2;
                break;
            case "divide":
                result = no1 / no2;
                break;
        }
        return "The result is " + result;
    }
}
