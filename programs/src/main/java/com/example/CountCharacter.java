package com.example;

public class CountCharacter {

    static String s = "wE1c@me T0 J@va Pr0gr@m!";
    public static void countOfEachCharacter(){
        System.out.println("Actual String : " +s);
        int CountOfSmall = 0, CountOfCaps = 0, CountOfNum = 0, CountOfSpecial = 0;
        for ( int i = 0; i < s.length(); i++){
            if('a' <= s.charAt(i) && s.charAt(i)<='z'){
                CountOfSmall++;
            } else if('A'<=s.charAt(i) && s.charAt(i)<='Z'){
                CountOfCaps++;
            } else if ('0'<=s.charAt(i) && s.charAt(i)<='9'){
                CountOfNum++;
            } else{
                CountOfSpecial++;
            }
        }
        System.out.println("Count of Capital Letters : " +CountOfCaps);
        System.out.println("Count of Small Letters : " +CountOfSmall);
        System.out.println("Count of Numbers : " +CountOfNum);
        System.out.println(("Count of Special characters : " +CountOfSpecial));
    }       
    
    public static void main(String args[]){
        countOfEachCharacter();
    }
}
