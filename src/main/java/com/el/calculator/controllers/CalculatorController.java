package com.el.calculator.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.el.calculator.models.Calculator;
@Controller
@RequestMapping("/")
public class CalculatorController {
	private Calculator c;
	private List<String> history = new ArrayList<>();
	public CalculatorController() {
		c = new Calculator();
	}
	
	@GetMapping("/")
	public ModelAndView showCalculator() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
			return mv;
	}
	@PostMapping("/")
		public ModelAndView showResult(int firstNumber, String operation, int secondNumber) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
			
			mv.addObject("firstNumber", firstNumber);
			mv.addObject("operation", operation);
			mv.addObject("secondNumber", secondNumber);
			
			c.calculator(firstNumber, secondNumber, operation);
			double result = c.calculator(firstNumber, secondNumber, operation);
			
			String hist = firstNumber + " " + operation + " "+ secondNumber +"=" + result;
			history.add(0, hist);
			
			mv.addObject("result", result);
			mv.addObject("history", history);
			
			return mv;
	}
	
	

}
