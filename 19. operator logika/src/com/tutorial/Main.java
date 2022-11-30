package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int nilaiTebakan=4;
        int nilaiMasukan;
        boolean statusTebakan;
        Scanner userInput=new Scanner(System.in);

        System.out.print("nilai Masukan = ");
        nilaiMasukan= userInput.nextInt();

        statusTebakan=nilaiTebakan==nilaiMasukan;
        System.out.println("status Tebakan = "+statusTebakan);

        System.out.println("masukan nilai anatara 2 sampai 9");
        System.out.println("nilai Masukan = "+nilaiMasukan);
        //nilaiMasukan= userInput.nextInt();
        statusTebakan=nilaiMasukan<=9 && nilaiMasukan>=2;
        System.out.println("status Tebakan = "+statusTebakan);


    }


}
