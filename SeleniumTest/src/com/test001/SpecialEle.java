package com.test001;

import java.util.HashMap;
import java.util.Map;

//import sun.jvm.hotspot.oops.ReturnTypeEntry;

public class SpecialEle {
	public static  int  SpecialNum(int [] nums) {
		if(nums.length==0) {
			return 0;
		}
		Map<Integer,Integer> map = new HashMap<>();
		int l = nums.length/2;
		for(int i = 0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i],map.get(nums[i])+1);
				
			}
			else {
				map.put(nums[i], 1);
			}
			
			if(map.get(nums[i])>l){
				return nums[i];
			}
			//return 0;
		}
		
		return 0;
	}
	public static void main(String[] args) { 
		int [] arr = {1,2,1,2,1,1,1,1};
		System.out.print(SpecialNum(arr));
		
	
		
	}

}
