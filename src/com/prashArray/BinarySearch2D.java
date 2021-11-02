package com.prashArray;
import java.util.Arrays;
//Row wise sorted as well as column wise sorted
// 10, 20, 30, 40
// 15, 25, 35, 45
// 28, 29, 37, 49
// 33, 34, 38, 50

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        // System.out.println(Arrays.deepToString(arr));

        int val=37;
        System.out.println(Arrays.toString(bin_search2D(arr, val)));
    }

    public static int[] bin_search2D(int[][] arr, int target){
        int r=0;
        int c=arr.length-1;
        while(c>=0 && r<arr.length){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
