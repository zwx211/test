package com.company;

public class Day10 {
    //二维数组
    public static boolean findNum(int [][] matrix ,int target){
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        int row = 0;
        int col = matrix.length-1;
        while (row<matrix[0].length&&col>0){
            if(target==matrix[row][col]){
                return true;
            }
            else if(target<matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] [] arr =
                {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int x =14;
        System.out.println(findNum(arr,x));
    }
}
