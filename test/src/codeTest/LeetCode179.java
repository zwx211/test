package codeTest;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode179 {
        public String largestNumber(int[] nums) {

            StringBuilder res = new StringBuilder();

            int zeroCount = 0;

            if (nums.length < 1) {
                return res.toString();
            }
            String[] numsStr = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                numsStr[i] = String.valueOf(nums[i]);
                if (nums[i]==0){
                    zeroCount++;
                }
            }
            if (zeroCount== nums.length){
                return "0";
            }
            quickSort(numsStr, 0, nums.length - 1);
            for (String s : numsStr) {
                res.append(s);
            }
            return res.toString();
        }

        private void quickSort(String[] numsStr, int left, int right) {
            if (left > right) {
                return;
            }

            int pIndex = partition(numsStr, left, right);
            quickSort(numsStr, left, pIndex - 1);
            quickSort(numsStr, pIndex + 1, right);
        }

        private int partition(String[] numsStr, int left, int right) {
            String pivot = numsStr[left];
            int lt = left;
            for (int i = left + 1; i <= right; i++) {
                if ((numsStr[i] + pivot).compareTo(pivot + numsStr[i]) > 0) {
                    lt++;
                    swap(numsStr, lt, i);
                }
            }
            swap(numsStr, lt, left);
            return lt;
        }

        private void swap(String[] numsStr, int i, int j) {
            String temp = numsStr[i];
            numsStr[i] = numsStr[j];
            numsStr[j] = temp;
        }
    class Solution {
        private class LargerNumberComparator implements Comparator<String> {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        }

        public String largestNumber(int[] nums) {
            // Get input integers as strings.
            String[] asStrs = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                asStrs[i] = String.valueOf(nums[i]);
            }

            // Sort strings according to custom comparator.
            Arrays.sort(asStrs, new LargerNumberComparator());

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
    }


    }


