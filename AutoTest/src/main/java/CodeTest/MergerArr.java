package CodeTest;

public class MergerArr {
    public static void main(String[] args) {

    }
    public void mergeList(int arr1[] ,int m,int arr2[],int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>-1&&j>-1){
            if(arr1[i]>=arr2[j]){
                arr1[k]=arr1[i];
            }
            else{
                arr2[k]=arr2[j];
            }
            if(j>=0){
                for(i = 0;i<j;i++){
                    arr1[i]=arr2[j];
                }
            }
        }
    }
}
