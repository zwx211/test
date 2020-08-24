package codeTest;

public class SameString {
    public static  boolean isSameString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        StringBuilder sb_res = new StringBuilder(sb).reverse();
        return sb.toString().equals(sb_res.toString());

    }

    public static void main(String[] args) {
        String str = "aaaabbbb";
        String  str1 = "aaaa；a";
        System.out.println(isSameString(str));
        System.out.println(isSameString(str1));
    }
}
