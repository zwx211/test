package com.company;

public class Day06 {
    //字符串反转--输入字符数组
    public static char [] reverseString(char [] ch){
        if(ch.length==0){
            return null;
        }
        for(int i =0;i<ch.length/2;i++){
            char tmp = ch[i];
            ch[i] = ch[ch.length-i-1];
            ch[ch.length-i-1] = tmp;
        }
        return ch;

    }

    public static void main(String[] args) {
        char [] chs = {'a','b','d'};
        System.out.println(reverseString(chs));
    }
}
