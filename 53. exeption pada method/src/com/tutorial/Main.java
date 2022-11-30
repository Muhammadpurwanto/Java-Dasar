package com.tutorial;
import com.sun.jdi.event.ExceptionEvent;

import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int arrayData[]={0,1,2,3};
        Scanner userInput=new Scanner(System.in);
        System.out.print("data ke-");
        int indexInput= userInput.nextInt();

        //exeption biasa
        System.out.println("-----exeption biasa------");
        try {
            System.out.printf("index ke-%d, adalah %d",indexInput,arrayData[indexInput]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("index tidak sesuai jumlah array");
        }

        //exeption di dalam fungsi
        System.out.println("\n-----exeption di dalam fungsi-----");
        //int data= ambilData(indexInput,arrayData);
      //  System.out.printf("index ke-%d, adalah %d",indexInput,data);
        ambilData(indexInput,arrayData);
        System.out.println(arrayData[indexInput]);

        //exeption throws by method
        System.out.println("\n-----exeption throws by method-----");
        int data2=0;
        try {
            data2= ambilData2(indexInput,arrayData);
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.printf("index ke-%d, adalah %d",indexInput,data2);


        System.out.println("\nakhir progam");
    }
    private static int ambilData2(int index,int array[])throws Exception{
        int hasil=array[index];
        return hasil;
    }


    private static int ambilData(int index,int array[]) {
        int hasil = 0;
        try {
            hasil= array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
        return hasil;

    }
}
