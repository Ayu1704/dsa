import java.util.*;
//syntax- datatype[] variable_name = new datatype[size];
public class arrays{
    public static void main(String[] args) {
        // int[] rollno - declaration in stack memory - at compile time
        // new int[5] - initialization ...creation of object in heap memory - at runtime(dynamic allocation)
        int[] rollno = new int[5];
        int[] rolln = {3,4,6,7,8};
        String[] name = new String[5];// string is stored in heap memory
//array of primitives
// taking input in arrays
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 9;
        //[1,3,4,6,9]
        System.out.println(arr[3]);

// input using for loop
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

// 2nd method
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
//3rd method (for each loop)
        for(int i:arr){// for every element in array,print
            System.out.println(i + " ");// here i reprents element of array
        }
       // System.out.println(arr[5]); // gives an error array out of bound

//array of objects
        String[] str = new String[5];
        for (int i = 0 ; i < str.length;i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1] = "ayu";
        System.out.println(Arrays.toString(str));

//mutable behaviour of arrays using function(modification)
int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[1] = 100;
    }
}