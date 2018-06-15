package com.el.calculator.models;

public class Calculator {
public double calculator(double firstNumber, double secondNumber, String operation) {
	if(operation.equals("+")) {
		double result = firstNumber + secondNumber;
		return result;
	}
	System.out.println(operation);
	if( operation.equals("-")) {
		double result = firstNumber - secondNumber;
		return result;
	}
	if( operation.equals("*")) {
		double result = firstNumber * secondNumber;
		return result;
	}
	if( operation.equals("/")) {
		double result = firstNumber / secondNumber;
		return result;
	}
	else{
		double result = (int) Math.pow(firstNumber,secondNumber);
		return result;
	}
	

}
}
