package com.test001;

import java.util.HashSet;

import javax.swing.text.ChangedCharSetException;

import java.util.*;


public class Duplicate {
	public  String  Common(String  strs) {
		if(strs.length()==0||strs.length()==1) {
			return strs;
		}
		Set<Character>  set = new HashSet<>();
		for(int i =0;i<strs.length();i++) {
			char c = strs.charAt(i);
			set.add(c);
		}
		String s= set.toString();
		
		return s;
	}
}
