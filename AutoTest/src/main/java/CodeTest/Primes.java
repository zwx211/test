package CodeTest;

public class Primes {
    public static boolean isPrimes(int n){
        boolean flag = true;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = false;
                break;
            }

        }
        return flag;
    }
    public  static int countPrimes(int n ){
        int count=0;
        if(n>2) {
            count =1;
            for (int i = 3; i < n; i += 2) {
                if (isPrimes(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
        System.out.println(isPrimes(n));
    }
}
