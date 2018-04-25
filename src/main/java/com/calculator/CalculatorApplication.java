package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
//        SpringApplication.run(CalculatorApplication.class, args);
        CalculatorApplication calc = new CalculatorApplication();

        System.out.println(calc.dodawanie(2,3));
        System.out.println(calc.odejmowanie(9,3));
    }

    public int dodawanie(int a, int b) {
        return a + b;
    }

    public int odejmowanie(int a, int b) {
        return a - b;
    }
}
