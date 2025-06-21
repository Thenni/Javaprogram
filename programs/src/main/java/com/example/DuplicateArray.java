package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class DuplicateArray {
        
    static String[] s = {"abc", "sdv","fdf", "abc"}; 

    public static void removeDuplicate(){
        List<String> list = Arrays.asList(s);
        System.out.println("Actuals String : " +list);
        TreeSet<String> t = new TreeSet<String>(list);
        System.out.println("Sorted & Duplicate removed string" +t);
    }

    public static void findDuplicate(){
        for(int i=0; i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    System.out.println("Duplicate is : " +s[j]);
                }
            }
        }
    }

    public static void main(String args[]){
        removeDuplicate();
        findDuplicate();
    }
}
