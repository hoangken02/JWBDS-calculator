package com.kenit.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("")
    public String index(){
        return "index";
    }
    @GetMapping("/calculator")
    public String calculator(@RequestParam("firstNumber") float firstNumber, @RequestParam("secondNumber") float secondNumber, @RequestParam("operator") char operator, Model model){
        float result = calculate(firstNumber,secondNumber,operator);
        model.addAttribute("result",result);
        return "index";
    }

    public static float calculate(float firstNumber, float secondNumber, char operator){
        switch (operator){
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if(secondNumber != 0)
                    return firstNumber / secondNumber;
                else
                    throw new RuntimeException("Can't divide by zero");
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}