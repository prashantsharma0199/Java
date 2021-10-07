package com.prashArray.SubArray;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class SW2Def {
    public static void main(String[] args) {
        int[] arr={12, -1, -7, 8, -16, 30, 16, 28};
        int windowSize= 3;
        SW(arr, windowSize);
    }

    public static void SW(int[] arr, int k){
        PriorityQueue<Integer> queue= new PriorityQueue<>();
        int i=0;
        int j=0;
        while(j< arr.length){
            if(arr[j]<0){
                queue.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(queue.isEmpty()){
                    System.out.println(0);
                }
                else if(arr[j]== queue.peek()) {
                    System.out.println(arr[j]);
                    queue.remove();
                }
                i++;
                j++;
            }
        }
    }


}
