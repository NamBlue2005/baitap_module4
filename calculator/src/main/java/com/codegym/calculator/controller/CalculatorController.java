package com.codegym.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showCalculatorForm(Model model) {
        model.addAttribute("result", "");
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("firstNumber") String firstNumberStr,
            @RequestParam("secondNumber") String secondNumberStr,
            @RequestParam("operation") String operation,
            Model model) {

        double result = 0;
        String errorMessage = null;

        try {
            double firstNumber = Double.parseDouble(firstNumberStr);
            double secondNumber = Double.parseDouble(secondNumberStr);

            switch (operation) {
                case "addition":
                    result = firstNumber + secondNumber;
                    break;
                case "subtract":
                    result = firstNumber - secondNumber;
                    break;
                case "multiply":
                    result = firstNumber * secondNumber;
                    break;
                case "divide":
                    if (secondNumber == 0) {
                        errorMessage = "Không thể chia cho 0.";
                    } else {
                        result = firstNumber / secondNumber;
                    }
                    break;
                default:
                    errorMessage = "Phép tính không hợp lệ.";
                    break;
            }
        } catch (NumberFormatException e) {
            errorMessage = "Vui lòng nhập số hợp lệ.";
        } catch (Exception e) {
            errorMessage = "Đã xảy ra lỗi: " + e.getMessage();
        }

        model.addAttribute("firstNumber", firstNumberStr);
        model.addAttribute("secondNumber", secondNumberStr);

        if (errorMessage != null) {
            model.addAttribute("result", errorMessage);
        } else {
            model.addAttribute("result", result);
        }

        return "index";
    }
}