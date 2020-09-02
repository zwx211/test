package com.test001;

import java.util.ArrayList;
import java.util.Collection;

public class doudizhu {
	public static void main (String [] args) {
		String [] arr = {"ºÚÌÒ","ºìÌÒ","·½","Ã·"	};
		String [] arr1 = {"A"};
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j<arr1.length; j++) {
				al.add(arr[i]+arr1[j]);
			}
		}
			al.add("dawang");
			al.add("xiaowang");
			//Collection.shuffle(al);
			ArrayList<String> person1 = new ArrayList<String>();
			ArrayList<String> person2 = new ArrayList<String>();
			ArrayList<String> person3 = new ArrayList<String>();
			for(int i= 0; i<al.size()-3;i++) {
				if (i%3==0) {
					person1.add(al.get(i));
				}
				else if (i%3==1) {
					person2.add(al.get(i));
				}
				else if (i%3==2) {
					person3.add(al.get(i));
				}
			}
					System.out.print("person1"+person1);
					System.out.print("person2"+person2);
					System.out.print("person3"+person3);
					for(int i = al.size()-3;i<al.size();i++) {
						System.out.print(al.get(i));
					
					
				}
			}
		}
			

