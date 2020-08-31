package codeTest;

import java.util.Stack;

public class ValidString {
    public boolean validStr(String s ){
        if(s.length()%2==1){
            return  false;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch = st.peek();
                if(ch=='('&&c==')'||ch=='{'&&c=='}'||ch=='['&&c==']'){
                    st.pop();
                }

            }

        }
        return st.isEmpty();

    }
}
