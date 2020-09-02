package codeTest;

import java.util.ArrayList;

public class OddTest {
    public static int oddTest(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        int j =0;
        for ( j = 0; j < arr.length; j++) {
            if (arr[j] == x) {
                return j;
            }
        }
        return j;
    }
    }

