package Array;

import java.util.*;
public class twoDarrays {
    public static void main(String[] args) {
        /* 1 2 3
           4 5 6
           7 8 9
         */
        // syntax - datatype[][] variablename = new datatype[rows][columns];
        // size of row is required and colunm not its optional

        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println(arr.length); // this gives no. of rows
        //or
//        int[][] ar = {{1,2,3 }, //oth index
//                {4,5 },// 1st index
//                {6,7,8}};//2nd index -> ar[2] = {6,7,8}
        // assign size for each row
        //use this when you don't specify size of col here: int[][] arr = new int[3][];
        /*for (int row = 0; row < arr.length; row++) {
            System.out.print("Enter number of columns for row " + row + ": ");
            int colSize = sc.nextInt();
            arr[row] = new int[colSize];
        }
        */

// input
        for(int row = 0; row < arr.length;row++) {
            // for each col in  every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= sc.nextInt();
            }
            System.out.println();
        }
//output1
        for(int row = 0; row < arr.length;row++) {
            // for each col in  every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col] + " ");
            }
           // System.out.println();
        }
//output2
        for(int row = 0; row < arr.length;row++) {
            // for each col in  every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
//output3
        for(int row = 0; row < arr.length;row++) {
            // for each col in  every row
            System.out.println(Arrays.toString(arr[row]));
        }
//enhanced for loop output4
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }

}
