package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrderNumber {
    
    public static void ascendingorder(){
        int a[] = {10, 20, 300, 400, 76, 88, 350, 6};
        int temp;
        for ( int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending order : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
    
        }
    }
        
    public static void getNummbersAndSortAscending(){
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers to sort : ");
        int length = s.nextInt();
        int temp = 0;
        int a[]= new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter number" +i+ " : ");
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Acending order : ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] +" " );
        }
    }

    public static void sortUsingArraysFunction(){
        int a[] = {6, 9, 25, 62, 78, 21, 3};
        Arrays.sort(a);
        System.out.println("Acending order : ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] +" " );
        }
    }
      
    public static void main(String[] args){
        sortUsingArraysFunction();
        ascendingorder();
        getNummbersAndSortAscending();
    }
    
}
