package com.company;

public class ExcelTitle {
    public static String coverTitle(int n ){
        if(n<=0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n>0){
            n = n-1;
            sb.append((char)n%26+'A');
            n = n/26;

        }
        sb = sb.reverse();
        return sb.toString();
    }
}
