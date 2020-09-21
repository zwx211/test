package codeTest;

import java.util.Arrays;
import java.util.Comparator;

class LargestNumber {
    private static class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a+b;
            String order2 = b+a ;
            return order2.compareTo(order1);
        }
    }

    public static String largestNumber(int[] nums) {
        // Get input integers as strings.
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }

        // Sort strings according to custom comparator.
        Arrays.sort(asStrs, new LargerNumberComparator());
        for (int i =0;i< asStrs.length;i++){
            System.out.println(asStrs[i]);
        }
        // If, after being sorted, the largest number is `0`, the entire number
        // is zero.
        if (asStrs[0].equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;
    }

    public static void main(String[] args) {
        Integer [] arr = {123,12,122,333,43};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int value :arr){
            System.out.println(value);
        }
        //System.out.println(largestNumber(arr));;
    }
}

