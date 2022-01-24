package com.prashQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(ListPer("",str));
    }

    public static ArrayList<String> ListPer(String res, String str){
        if(str.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        char ch=str.charAt(0);
        for(int i=0; i<=res.length(); i++){
            ans.addAll(ListPer(res.substring(0,i)+ch+res.substring(i), str.substring(1)));
        }

        return ans;
    }
}
