package org.basics.Arrays;

public class SumOfEven {
    public static void main(String[] args) {
        int a[]={0,22,33,4,21,23,23};
        int sum=0;
        for(int i:a){
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println("Sum of even numbers in a array : "+sum);
    }
}
