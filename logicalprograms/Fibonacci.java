package com.bridgelabz.logicalprograms;

import com.bridgelabz.logicalutility.Utility;

public class Fibonacci {

	
	 public static void main(String[] args) {
	        Utility utility = new Utility();
	        int firstNumber = 1;
	        int secondNumber = 2;
	        System.out.println("Enter a number to find Fibonacci Series:: ");
	        int upToSum = utility.getIntValue();
	        utility.fibonacciSeries(upToSum, firstNumber, secondNumber);
	    }
	}
	
	

