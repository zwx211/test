package com.company;

import org.w3c.dom.ls.LSResourceResolver;

import java.io.*;
import java.util.*;

public class SameWordsCount {


    public static void main(String[] args){
        //统计文本中出现频率前十的word

    }
    public static void display(String path) throws IOException {
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = null;
        Map<String,Integer> hashMap = new HashMap<>();
        while ((line=bufferedReader.readLine())!=null){
            line = line.toLowerCase();
            String reg1= "\\s+";
            String reg2 = "\\w+";
            String [] str = line.split(reg1);
            for(String s:str){
                if(s.matches(reg2)){
                    if(!hashMap.containsKey(s)){
                        hashMap.put(s,1);

                    }
                    else {
                        hashMap.put(s,hashMap.get(s)+1);
                    }


                }

            }




        }





    }
}
