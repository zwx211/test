package com.company;

public class Day11 {
    public  static int minValue(int [] arr){
        if(arr.length==0){
            return 0;
        }
        int min = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arrs = {1,2,3,5,4,3,1};
        System.out.println(minValue(arrs));
    }
}
