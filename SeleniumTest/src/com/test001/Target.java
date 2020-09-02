package com.test001;

import static org.junit.Assume.assumeFalse;

import java.util.HashMap;
import java.util.Map;



public class Target {
	public static int [] TwoSum(int [] nums ,int target) {
		if(nums.length == 0) {
			return null;
		}
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[2];
		for(int i = 0; i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				arr[0]= i;
				arr[1]= map.get(target-nums[i]);
			}
			map.put(nums[i], i);
		}
		return arr;
		
		
	}
	public static void main(String [] args) {
		int[] arr1 = {1,2,3,6};
		int target1 = 5;
		System.out.println(TwoSum(arr1,target1));		
		
	}

}

