package com.company;

public class Day12 {
        // you need to treat n as an unsigned value
        public static int  hammingWeight(int n) {
            String s = "";
            while (n != 0) {
                s = n % 2 + s;
                n = n / 2;
            }
            char[] ch = s.toCharArray();
            int count = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '1') {
                    count++;

                }
               // return count;
            }
            return count;
        }


    public static void main(String[] args) {
        int x = 4;
        System.out.println(hammingWeight(x));


    }
}
