package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private void notNullException(Integer num1, Integer num2){
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Ошибка! Не введенны параметры!");
        }
    }

    public String hello(){
        return "Добро пожаловать в калькулятор!";
    }

    public Integer plus (Integer num1, Integer num2){
        notNullException(num1, num2);
        return num1 + num2;
    }

    public Integer minus (Integer num1, Integer num2){
        notNullException(num1, num2);
        return num1 - num2;
    }

    public Integer multiply (Integer num1, Integer num2){
        notNullException(num1, num2);
        return num1 * num2;
    }

    public Double divide (Integer num1, Integer num2){
        notNullException(num1, num2);
        if (num2 == 0){
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        Double res = (double) (num1 / num2);
        return res;
    }
}
