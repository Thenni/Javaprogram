package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class SortNames {

    public static ArrayList getnames(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Thenni");
        names.add("Adhithi");
        names.add("Udhaya");
        names.add("Siddharth");
        return names;
    }

    public static void ascendingNames(){
        ArrayList<String> names = getnames();
        Collections.sort(names);
        System.out.println("Ascending names: " +names);
    }

    public static void descendingNames(){
        ArrayList<String> names = getnames();
        Collections.sort(names,Collections.reverseOrder());
        System.out.println("Descending Names: " +names);
    }

    public static void main(String[] args){
        ascendingNames();
        descendingNames();
    }
    
}
