package codeTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class RepeatArr {
    public int [] repeatArr(int [] nums1,int [] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            map.put(nums1[1],i);

        }
        for(int j = 0;j<nums2.length;j++){
            if(map.containsKey(nums2[j])){
                set.add(nums2[j]);
            }
        }
        Iterator iterator = set.iterator();
        int [] arr = new int[set.size()];
        int k = 0;
        while(iterator.hasNext()){
            arr[k] = (int)iterator.next();
            k++;

        }

        return arr;
    }
}
