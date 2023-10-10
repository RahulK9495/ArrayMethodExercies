package com.prowings.programmes;

public class verifyEvenNumber {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 5, 7, 8, 10 };

		int[] result = filterEvenNumber(nums);

		System.out.println("Filtered even numbers are");

		for (int n : result)
			System.out.println(n);

	}

	public static int[] filterEvenNumber(int[] nums) {

		int counter = 0;
		int counter1 = 0;
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				result[counter] = nums[i];
				counter++;
			}
		}
		return result;

	}
}
