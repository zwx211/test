package com.test001;


public class Solution {
	public static String  LongestCommon(String [] strs) {
		if(strs.length==0) {
			return "";
		}
		int j = 0;
		String s = strs[0];
		for(int i= 0; i<strs.length; i++) {
			
			for(j = 0; j<s.length()&&j<strs[i].length();j++) {
				if(s.charAt(j)!=strs[i].charAt(j)) {
					break;
				}
			}
			s= s.substring(0,j);
		
		}
		return s;
		
	}
	public static void main(String[] args) { 
		String [] strs = new String [] {"flo2222","flroe"};
		String ss=LongestCommon(strs);
		System.out.print(ss);
	}

}

