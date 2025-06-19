package com.example;

import java.util.Scanner;

public class ArmstrongNumber {
    
    public static void findArmstrongNumber(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        int a, i=0,j=0;
        a=num;
        while(a>0){
            i = a%10;
            j = j + (i*i*i);
            a = a/10;
        }
        if(j==num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }
    }

    public static void AllArmstrongNumber0to1000(){
        for(int n=0; n<=1000; n++){
            int a, i=0, j=0;
            a=n;
            while(a>0){
                i = a%10;
                j = j + (i*i*i);
                a = a/10;
            }
            if(j == n){
                System.out.println(n +"is Armstrong number");
            }
        }
    }
    public static void main(String[] args){
        findArmstrongNumber();
        AllArmstrongNumber0to1000();
    }
    
}
