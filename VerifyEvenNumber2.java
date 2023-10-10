package com.prowings.programmes;

import java.util.Arrays;

public class VerifyEvenNumber2 {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 6, 8, 12, 23, 13, 14 };

		int[] result = filterEvenNumbers(nums);

		System.out.println("Even Numbers are :");

		System.out.println(Arrays.toString(result));
//		
//		for(int n:result)
//			System.out.println(n);

	}

	public static int[] filterEvenNumbers(int[] nums) {
		int anothercounter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				anothercounter++;
			}
		}

		int counter = 0;
		int[] result = new int[anothercounter];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				result[counter] = nums[i];
				counter++;
			}
		}
		return result;

	}

}
