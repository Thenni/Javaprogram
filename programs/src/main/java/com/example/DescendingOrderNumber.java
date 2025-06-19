package com.example;

public class DescendingOrderNumber {

    public static int[] getNubers(){
        int a[] = {6, 9, 25, 62, 78, 21, 3};
        return a;   
    }
    
    public static void descedingOrder(){
        int a[] = getNubers();
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Descending Order :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }

    public static void main(String[] args){
        descedingOrder();
    }
}
