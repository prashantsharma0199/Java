package com.prashQuestions;

// https://www.geeksforgeeks.org/length-of-the-longest-substring-with-every-character-appearing-even-number-of-times/
// Length of the longest substring with every character appearing even number of times

// Input: S = “324425”
// Output: 4
// Explanation: Two substrings consisting of even frequent elements only are “44” and “2442”.
// Since “2442” is the longer of the two, print 4 as the required answer.

// Input: S = “223015150”
// Output: 6
// Explanation: Three substrings consisting of even frequent elements only are “22”, “1515” and “015150”.
// Since “015150” is the longest among the three, print 4 as the required answer.


import java.util.HashMap;

public class Ques1 {
    public static void main(String[] args) {
        String s = "324425";
        System.out.println(maximum(s));
    }

    public static int maximum(String s){
        int max=0;
        HashMap<Character, Integer> map= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char val=s.charAt(i);
            map.put(val, map.getOrDefault(val,0)+1);
            if(map.get(val)%2==0){
                max=i;
            }
        }
        return max;
    }
}
