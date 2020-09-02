package com.company;

public class Day09 {
    //替换空格为%20
    public static String replaceNew(String s ){
        StringBuilder sb = new StringBuilder();
        char [] ch = s.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i]==' '){
                sb.append("%20");
            }
            else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s  =  "wu zi xian";
        System.out.print(replaceNew(s));
    }
}
