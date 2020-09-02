package CodeTest;

public class LongCommon {
    public String longest(String [] str){
        if(str.length==0){
            return "";
        }
        String s = str[0];
        int j ;
        for(int i = 1;i<str.length;i++){
            for(j=0;j<str[i].length()&&j<s.length();j++){
                if(s.charAt(j)!=str[i].charAt(j)){
                    break;
                }
            }
            s=s.substring(0,j);

        }
        return s;

    }
}
