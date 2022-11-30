package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        //assigment
        System.out.println("Assigment array");
        int[]arrayinteger={1,2,3,4};
        arrayinteger[0]=11;

        System.out.println(arrayinteger[0]);
        System.out.println(arrayinteger[1]);
        System.out.println(arrayinteger[2]);
        System.out.println(arrayinteger[3]);

        //deklarasi
        //tipeData[]=new int[jumlahArray];
        System.out.println("Deklarasi array");
        float[]arrayFloat=new float[5];
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);

        System.out.println(Arrays.toString(arrayinteger));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
