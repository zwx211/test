package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

 class LargestNun {
     private class LargestComPara implements Comparator<String>{
         @Override
         public int compare(String a, String b) {
             String o1 = a+b;
             String o2 = b+a;
             return o2.compareTo(o1);
         }
     }
     public int [] largerNum(int [] arr ){
         String [] arrStr = new String[arr.length];
         for(int i = 0; i<arr.length;i++){
             arrStr[i] = String.valueOf(arr[i]);

         }
         Arrays.sort(arrStr,new LargestComPara());
         for(int i = 0;i<arr.length;i++){
             arr[i]= Integer.valueOf(arrStr[i]);
         }
         return arr;
     }


}
