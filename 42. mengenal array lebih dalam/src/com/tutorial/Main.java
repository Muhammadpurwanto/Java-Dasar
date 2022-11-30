package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
     int a[]={2,3,6,4,9,6,5,9};
     int b[]=new int[8];
        System.out.println(a);
        System.out.println(b);

        b=a;
        System.out.println("array ke - "+Arrays.toString(a));
        System.out.println("array ke _ "+Arrays.toString( b));

        a[3]=20;
        System.out.println("array ke - "+Arrays.toString(a));
        System.out.println("array ke - "+Arrays.toString(b));

        ubahArray(a);
     for(int i=0;i<a.length;i++){
         System.out.println("array ke - " + i + " adalah " +Arrays.toString(a));
     }
    }
    private static void ubahArray(int data[]){
        data[2]=30;
        System.out.println("array ke - "+Arrays.toString(data));

    }


}
