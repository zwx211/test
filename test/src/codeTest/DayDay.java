package codeTest;

import java.util.HashMap;
import java.util.Map;

public class DayDay {
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i <nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],2);
            }
            map.put (nums[i],1);
        }
        for(int key:map.keySet()){
            int cal = map.get(key);
            System.out.println(cal);
            if(map.get(key)==1){
                //System.out.println(key);
                return key;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int [] arr ={1,1,4,4,3};
        System.out.println(singleNumber(arr));
    }
}
