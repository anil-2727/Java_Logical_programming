package com.bridgelabz.logicalutility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {

		return scanner.nextInt();
	}

	public Double getDouble() {
		return scanner.nextDouble();
	}

	public Boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public char getCharValue() {
		return scanner.next().charAt(0);

	}

	// Fibonacci Series

	public void fibonacciSeries(int upToSum, int firstNumber, int secondNumber) {
		System.out.println("Fibonacci Series Upto " + upToSum + ": ");
		while (firstNumber <= upToSum) {
			System.out.print(firstNumber + ", ");
			int temp = firstNumber;
			firstNumber = secondNumber;
			int updatedNumber = firstNumber + secondNumber;
			secondNumber = updatedNumber;
		}
	}

	// Perfect Number

	public void perfectNumber(int number) {
		int i, Sum = 0;
		for (i = 1; i < number; i++) {
			if (number % i == 0) {
				Sum = Sum + i;
			}
		}
		if (Sum == number) {
			System.out.format("\n% d is a Perfect Number", number);
		} else {
			System.out.format("\n% d is NOT a Perfect Number", number);
		}

	}

	// Prime Number

	public void primeNumber(int number) {
		int i, halfCondition = 0, flag = 0;
		halfCondition = number / 2;
		if (number == 0 || number == 1) {
			System.out.println(number + " is not prime number");
		} else {
			for (i = 2; i <= halfCondition; i++) {
				if (number % i == 0) {
					System.out.println(number + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(number + " is prime number.");
			}
		}
	}

	// Revers Number

	public void reverseNumber(int number) {
		int reversedNum = 0;
		while (number != 0) {
			int remenderDigit = number % 10;
			reversedNum = reversedNum * 10 + remenderDigit;
			number /= 10;
		}

		System.out.println("Reversed Number: " + reversedNum);
	}

	// Coupon Number
	public static void Coupon(int[] couponArray, int numberOfCoupons) {
		for (int i = 0; i < numberOfCoupons; i++) {
			couponArray[i] = (int) (Math.random() * 1000);

			for (int j = 0; j < i; j++) {
				if (couponArray[j] == couponArray[i]) {

					i = (i - 1);
				}
			}
			System.out.println(i + 1 + ":: Coupon number value is ::" + couponArray[i]);
		}
	}

}