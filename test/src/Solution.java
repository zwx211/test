public class Solution {
        public int [] twoSum(int [] arr,int target){
            for(int i = 0;i<arr.length;i++){
                for(int j = i+1;j<arr.length;j++){
                    if (arr[i]+ arr[j]==target){
                        int [] num = new int [2];
                        num[0] = i;
                        num[1] = j;
                        return num;
                    }
                }
            }
            return null;
        }
    }



