package Array;
import java.util.*;
import java.util.Arrays;
public class maximum {
    public static void main(String[] args) {
        int[] arr = {1,34,67,98,55,45,34};
        System.out.println(maxval(arr));
        System.out.println(maxinrange(arr,4,6));
    }
    // to find maximum
    static int maxval(int[] arr){
        //imagine oth index as maximum
        int max = arr[0];
        for(int i =0 ; i < arr.length;i++){
            if(arr[i]>max){
                max  = arr[i];
            }

        }
        return max;
    }
// to find maximum in range
    static int maxinrange(int[] arr,int start,int end){
        //imagine oth index as maximum
        int max = arr[start];
        for(int i =start ; i < end;i++){
            if(arr[i]>max){
                max  = arr[i];
            }

        }
        return max;
    }
}
