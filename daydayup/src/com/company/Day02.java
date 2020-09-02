package com.company;

public class Day02 {
    //合并有序数组
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[len] = nums1[i];
                i--;
            } else {
                nums1[len] = nums2[j];
                j--;
            }
            len--;
        }
        //return nums1;


    }
}



