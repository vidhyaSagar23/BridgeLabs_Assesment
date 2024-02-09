package org.basics.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleExceptions {
    public static void main(String[] args) {
        SampleExceptions s=new SampleExceptions();
        s.UncheckedException();
        System.out.println("---------------------------------------");
        s.CheckedExceptions();

    }

    public void UncheckedException(){
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException ex){
            System.out.println("Number Cannot be divided by zero ==> Arithmetic Exception");
        }
        System.out.println("-----------------------------------------");
        int a[]={1,2,3,4,5};
        try{
            for(int i=0;i<=5;i++){
                System.out.print(a[i]+" ");
            }
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("\nOutside the bound of array index ==> Array Index Out of Bound Exception");
        }
        System.out.println("-----------------------------------------");
        Father f= new Son();
        try{
            Daughter D=(Daughter)f;
        }
        catch (ClassCastException ex){
            System.out.println("Upcasted to one reference and downcasting to some other ==> Class Cast Exception");
        }

    }

    public void CheckedExceptions(){
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(2000);
                System.out.println(i);
            }
        }
        catch (InterruptedException ex){
            System.out.println("Interrupted Exception");
        }
        System.out.println("-----------------------------------------");

        try{
            FileReader fr=new FileReader("Hiii");
        }
        catch (FileNotFoundException ex){
            System.out.println("File Not Found");
            ex.printStackTrace();
        }
    }
}
