
package Array;

import java.util.Arrays;

public class reversing {
        public static void main(String[] args) {
            int[] arr = {1,34,56,78,90};
           // swapping(arr, 0 , 4);
            reverse(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void reverse(int[] arr) {
            int start=0;
            int end = arr.length-1;
            while(start<end) {
                //swap
                swapping(arr, start, end);
                start++;
                end--;
            }

        }
        static void swapping(int[] arr, int index1,int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }


