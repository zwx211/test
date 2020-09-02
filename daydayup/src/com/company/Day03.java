package com.company;

public class Day03 {
    //斐波那契数列，非递归
    public static int rabbitSon(int n){
        if(n<=2){
            return n;
        }
        int first = 1,second = 2,sum = 0;
        while (n>=3){
            sum = first+second;
            first = second;
            second= sum;
            n--;

        }
        return second;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(rabbitSon(n));
        System.out.println(1);

    }
}
