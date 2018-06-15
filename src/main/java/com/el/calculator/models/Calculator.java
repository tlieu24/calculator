package com.el.calculator.models;

public class Calculator {
public int calculator(int firstNumber, int secondNumber, String operation) {
	if(operation.equals("+")) {
		int result = firstNumber + secondNumber;
		return result;
	}
	System.out.println(operation);
	if( operation.equals("-")) {
		int result = firstNumber - secondNumber;
		return result;
	}
	if( operation.equals("*")) {
		int result = firstNumber * secondNumber;
		return result;
	}
	if( operation.equals("/")) {
		int result = firstNumber / secondNumber;
		return result;
	}
	else{
		int result = (int) Math.pow(firstNumber,secondNumber);
		return result;
	}
	

}
}
