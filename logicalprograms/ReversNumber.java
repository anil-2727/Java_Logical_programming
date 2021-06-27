package com.bridgelabz.logicalprograms;

import com.bridgelabz.logicalutility.Utility;

public class ReversNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter a number to reverse:");
		int number = utility.getIntValue();
		utility.reverseNumber(number);
	}

}
