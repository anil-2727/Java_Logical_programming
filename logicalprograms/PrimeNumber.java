package com.bridgelabz.logicalprograms;

import com.bridgelabz.logicalutility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Enter the number to check prime number");
		int number = utility.getIntValue();
		utility.primeNumber(number);
	}
}
