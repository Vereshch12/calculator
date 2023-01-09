package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private CalculatorService calculatorService = new CalculatorService();

    @GetMapping
    public String hello(){
        return calculatorService.hello();
    }

    @GetMapping("plus")
    public String plus (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        Integer res = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + res;
    }

    @GetMapping("minus")
    public String minus (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        Integer res = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + res;
    }

    @GetMapping("multiply")
    public String multiply (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        Integer res = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + res;
    }

    @GetMapping("divide")
    public String divide (@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        Double res = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + res;
    }
}
