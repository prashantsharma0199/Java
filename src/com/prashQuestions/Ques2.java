package com.prashQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class Ques2 {
    public static int[]  freqSort(int[] listEle)
    {
        int[]  answer = new int[100];

        // Write your code here






        return answer;
    }

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        //input for listEle
        int listEle_size = in.nextInt();
        int listEle[] = new int[listEle_size];
        for(int idx = 0; idx < listEle_size; idx++)
        {
            listEle[idx] = in.nextInt();
        }

        int[] result = freqSort(listEle);
        for(int idx = 0; idx < result.length - 1; idx++)
        {
            System.out.print(result[idx] + " ");
        }
        System.out.print(result[result.length - 1]);
    }
}
