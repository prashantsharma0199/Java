package com.prashArray;
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        System.out.println(Arrays.toString(findIndex(arr, 8)));
    }

    public static int[] binarySearch(int[][] arr, int r, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int cMid= cStart+(cEnd-cStart)/2;
            if(arr[r][cMid]== target){
                return new int[] {r,cMid};
            }
            else if(arr[r][cMid]>target){
                cEnd=cMid-1;
            }
            else{
                cStart=cMid+1;
            }
        }
        return new int[] {-1,-1};
    }

    public static int[] findIndex(int[][]arr, int target){
        int rows= arr.length;
        int cols= arr[0].length;

        if(rows==1){
          return binarySearch(arr, 0, 0, cols-1, target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cStart=0;
        int cEnd=cols-1;
        int cMid= cStart+(cEnd-cStart)/2;

        while (rStart< (rEnd-1)){
            int rMid= rStart+(rEnd-rStart)/2;
            if(arr[rMid][cMid]==target){
                return new int[] {rMid,cMid};
            }
            else if(arr[rMid][cMid]<target){
                rStart=rMid;
            }
            else{
                rEnd=rMid;
            }
        }

        //2 rows left only
        if(arr[rStart][cMid]==target){
            return new int[] {rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target){
            return new int[] {rStart+1,cMid};
        }

        // search in remaining 4 parts
        if(arr[rStart][cMid]>target){
            return binarySearch(arr, rStart, cStart, cMid-1, target);
        }
        if(arr[rStart+1][cMid]<target){
            return binarySearch(arr, rStart+1, cMid+1, cEnd, target);
        }
        if(arr[rStart][cMid]<target){
            return binarySearch(arr, rStart, cMid+1, cEnd, target);
        }
        else{
            return binarySearch(arr, rStart+1, cStart, cMid-1, target);
        }
    }
}
