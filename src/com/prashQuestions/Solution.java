package com.prashQuestions;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int N= Integer.parseInt(scan.nextLine().trim());
        int M= Integer.parseInt(scan.nextLine().trim());

        String S= scan.nextLine();
        String T= scan.nextLine();

        int result= anagramSubseq(N,M,S,T);
        System.out.println(result);
    }

    public static int anagramSubseq(int N, int M, String S, String T) {
        int count=0;

        ArrayList<String> subset= new ArrayList<>();
        subset=retSubset("",S);

        for(int i=0; i<subset.size(); i++){
            if(isAnagram(subset.get(i), T)){
                count+=1;
            }
        }

        return count;
    }

    public static ArrayList<String> retSubset(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            if(ans.equals("")){
                return list;
            }
            list.add(ans);
            return list;
        }

        char ch= str.charAt(0);
        ArrayList<String> list1=retSubset(ans+ch, str.substring(1));
        ArrayList<String> list2=retSubset(ans, str.substring(1));
        list1.addAll(list2);
        return list1;
    }

    static boolean isAnagram(String subseq, String target)
    {
        int[] count= new int[500];
        char[] dummy1= subseq.toCharArray();
        for(int i=0; i<dummy1.length; i++){
            count[dummy1[i]]++;
        }

        char[] dummy2= target.toCharArray();
        for(int i=0; i<dummy2.length; i++) {
            if(count[dummy2[i]] == 0) {
                return false;
            }
            count[dummy2[i]]--;
        }
        return true;
    }

}
