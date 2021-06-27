package com.bridgelabz.logicalprograms;

import com.bridgelabz.logicalutility.Utility;

public class Coupon {

	
	 public static void main(String[] args) {
	        Utility utility = new Utility();
	        System.out.println("Enter the numbers of coupon");
	        int numberOfCoupons = utility.getIntValue();
	        int [] couponArray = new int[numberOfCoupons];
	        utility.Coupon(couponArray,numberOfCoupons);
	    }

}
