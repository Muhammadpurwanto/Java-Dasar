package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int angka1[]={3,3,2,5,6,9,5,3,7};
        int angka2[]={5,6,8,4,3,9,6,5,3};
        int hasil[]=new int[angka1.length];
        printarray(angka1,"array1 ");
        printarray(angka2,"array2 ");

        //penjumlahan array
       for(int i=0; i<angka1.length;i++){
         hasil[i]=  angka1[i]+angka2[i];
       }
       printarray(hasil,"ini hasil ");

        //perkalian array
        for(int i=0; i<angka1.length;i++){
            hasil[i]=  angka1[i]*angka2[i];
        }
        printarray(hasil,"ini hasil ");

       //menggabungkan array
        int hasil2[]=new int[angka1.length+angka2.length];
        for (int i=0; i<angka1.length; i++){
            hasil2[i]=angka1[i];
            hasil2[angka1.length+i]=angka2[i];
        }
        printarray(hasil2,"gabungan ");

        //sort revers
        Arrays.sort(angka1);
        printarray(angka1,"sort ");
        int revers[]=Arrays.copyOf(angka1,angka1.length);
        for(int i=0; i<angka1.length; i++){
            revers[i]=angka1[(angka1.length-1)-i];
        }
        printarray(revers,"revers ");

    }
    private static void printarray(int data[], String massage){
        System.out.println(massage + Arrays.toString(data));
    }
}
