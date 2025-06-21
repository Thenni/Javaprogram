package com.example;

public class CaseSwap {
    
    static String s = "wE1c@me T0 j@va Pr0gr@m!";

    public static void swapCase(){
        System.out.println("Actual String : " +s);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if('a'<=s.charAt(i) && s.charAt(i)<='z'){
                char c = Character.toUpperCase(s.charAt(i));
                sb.append(c);
            } else if ('A'<=s.charAt(i) && s.charAt(i)<='Z'){
                char c = Character.toLowerCase(s.charAt(i));
                sb.append(c);
            } else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void stringToUpperCase(){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = Character.toUpperCase(s.charAt(i));
            sb.append(c);
        }
        System.out.println("Upper Case : " +sb);;
    }

    public static void stringTolowerCase(){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            sb.append(c);
        }
        System.out.println("Lower Case : " +sb);;
    }   

    public static void initCaptalize(){
        String[] s1 = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s1.length;i++){
            char c = Character.toUpperCase(s1[i].charAt(0));
            String subString = s1[i].substring(1);
            sb.append(c).append(subString).append(" ");
        }
        String trim = sb.toString().trim();
        System.out.println(trim);
    }
    
    public static void main(String args[]){
        swapCase();
        stringToUpperCase();
        stringTolowerCase();
        initCaptalize();
    }
}