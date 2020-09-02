public class test {
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,-1,-2,3,3,3};
        int[] arr2 = testArr(arr1);
        for(int i = 0; i<arr2.length;i++) {
            System.out.print((arr2[i]));
        }
    }
    public static int [] testArr(int[] arr){
        int pos = 0;
        for(int i = 0;i<arr.length;i++){
                if (arr[i] <= 0 ) {
                    //int arr[i] = temp;

                    int temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                    pos = pos+1;

                }
            }
        return arr;

        }

    }

