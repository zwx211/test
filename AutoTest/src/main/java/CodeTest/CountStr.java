package CodeTest;

import java.util.HashMap;

public class CountStr {
    public static void main(String[] args) {
        String s = "aaaabbbbb";
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }

        }
        for(Character key:hm.keySet()){
            System.out.println(key+"="+hm.get(key));
        }

    }
}
