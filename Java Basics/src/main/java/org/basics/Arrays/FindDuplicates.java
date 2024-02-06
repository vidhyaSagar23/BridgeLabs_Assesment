package org.basics.Arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int a[]={0,3,2,1,3,2,4,5,6};
        System.out.println(Arrays.toString(duplicates(a)));
    }
    public static Integer[] duplicates(int a[]){
        TreeSet<Integer> set=new TreeSet();

        for(int i=0;i<a.length;i++){
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j])
                    set.add(a[i]);
            }
        }
        return set.toArray(new Integer[0]);
    }
}
