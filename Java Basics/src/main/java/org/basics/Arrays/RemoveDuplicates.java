package org.basics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={0,1,4,2,3,4,5,3,2};
        System.out.println(Arrays.toString(duplicates(a)));
    }
    public static Integer[] duplicates(int a[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:a){
            if(!list.contains(i)){
                list.add(i);
            }
        }
       return list.toArray(new Integer[0]);
}
}
