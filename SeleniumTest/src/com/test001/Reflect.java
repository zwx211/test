package com.test001;

import javax.swing.text.ChangedCharSetException;

//import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugins.InvocationPluginReceiver;

public class Reflect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String longCommString(String [] str) {
		if(str.length==0) {
			return null;
		}
		String s = str[0];
		for(int i = 1; i<str.length;i++) {
			for(int j = 0; j<s.length()&&j<str[i].length();j++) {
				char c  = str[i].charAt(j);
				if(s.charAt(j)!=c) {
					break;
					
				}
				s= s.substring(0,j);
				
			}
			
		}
		return s;
		
	}

}
