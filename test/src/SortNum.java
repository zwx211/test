public class SortNum {
    public void SortNumber(int [] arr,int left,int right){
        int i = left;
        int j = right;
        int key = arr[left];
        while (i<j){
            while(i<j&&arr[i]<=key){
                i++;
            }
                j++;

            }
            if(i<j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }


    }
}
