package codeTest;

    import java.util.Random;


    /**
     * @Author: weblee
     * @Email: likaiweb@163.com
     * @Blog: http://www.cnblogs.com/lkzf/
     * @Time: 2014年10月25日下午2:58:39
     *
     *************        function description ***************
     *一个整型数组中各元素排列组合得到的最大的一个数 ，比如，1,3,9,11,23,233,911 要得到：9，911，3，233，23，11，1
     ****************************************************
     *
     *solution:
     *    ①确定该数组array中数字最长的数字，得到最长len
     *    ②new 等长的数组doArray，存放处理之后的原数组（角标pos与值对应关系不变），how to 处理，将所有的数追加末尾数字c变为等长（len），
     *    ③对doArray 快速排序，同步交换 doArray、array的 角标对应的数字 swap(int[] doArray, int i, int j, int[] array)
     *
     *    时间O（nlog(n)）,空间O(n)
     */

    public class Tushen {
        public static void sort(int[] array) {
            int max = 0;
            for (int i = 1; i < array.length; i++) {
                if (max < array[i])
                    max = array[i];
            }

            int len = (max + "").length();
            int[] doArray = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                doArray[i] = doNum(array[i], len);
            }
            bubbleSort(doArray);
            for(int i = 0;i<doArray.length;i++){
                System.out.print(doArray[i]);

            }



        }
        static int doNum(int num, int len) {
            StringBuffer buffer = new StringBuffer(num + "");
            char c = buffer.charAt(buffer.length() - 1);

            int bit = buffer.length();

            while (bit != len) {
                buffer.append(c);
                bit++;
            }

            return Integer.parseInt(buffer.toString());
        }

        private static Random rand = new Random();

        /**
         * 快速排序法
         */
        private static void bubbleSort(int [] num){
            for(int i = 0;i<num.length;i++){
                for(int j = 0;j<num.length-1-i;j++){
                if(num[j]<num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }

                }
            }

        }



        // 输出方法，因为sort是按照从小到大的进行排序的，所以要Display方法处理一下
        public static void display(int[] L) {
            for (int i : L) {
                System.out.print(i + "");
            }
        }

        /**
         * @param args
         */
        public static void main(String[] args) {
            int[] arr = { 1, 3, 9, 11, 23, 233, 911 };
            sort(arr);

            display(arr);
        }
}
