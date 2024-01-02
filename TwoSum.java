package com.pavan.dsa;
//Comment added
public class TwoSum {
	public static void main(String [] args) {
		int [] numbers = new int[] {5, 2, 3};
		int target = 8;
		int [] indices = findIndices(numbers, target);
		if(indices.length == 0 ) {
			System.out.print("Target not found");
		}
		for(int i = 0 ; i < indices.length ; i++) {
			System.out.println(indices[i]);
		}
	}
	
	public static int [] findIndices(int [] numbers, int target) {
		for(int i = 0 ; i < numbers.length ; i++) {
			for(int j = i + 1 ; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return new int[] {};
	}
}
