package codeTest;

public class Longestpre {
        public static String longestCommonPrefix(String[] strs) {
            String s = strs[0];
            int j = 0;
            for(int i = 1;i<strs.length;i++){
                for( j = 0;j<s.length();j++){
                    if(s.charAt(j)!=strs[i].charAt(j)){
                        break;

                    }
                }
                s=s.substring(0,j);

            }
            return s;
        }

    public static void main(String[] args) {
        String [] str = {"aaab","aaasew","asdsdf"};
        String [] str1 = {"aaab","aaasew","2"};
        System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefix(str1));

    }

    }

