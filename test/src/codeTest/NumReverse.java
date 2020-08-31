package codeTest;

public class NumReverse {
    public static boolean numRev(int x){
        int num = x;
        if(x<0){
            return false;
        }

        int cur = 0;
        while(num!=0){
            cur = cur*10+num%10;
            num = num/10;
        }
        return (x==cur);
    }

    public static void main(String[] args) {
        System.out.println(numRev(123));
        System.out.println(numRev(121));
    }
}

