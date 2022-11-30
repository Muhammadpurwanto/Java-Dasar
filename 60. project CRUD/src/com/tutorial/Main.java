package com.tutorial;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{


        Scanner userInput = new Scanner(System.in);
        boolean lanjutkan=true;

        while(lanjutkan){
        clearScreen();
        System.out.println("Database perpustakaan");
        System.out.println("1.\tLihat seluruh buku");
        System.out.println("2.\tCari data buku");
        System.out.println("3.\tTambah data buku");
        System.out.println("4.\tUbah data buku");
        System.out.println("5.\tHapus data buku");

        System.out.print("\n\nPilihan anda: ");
        String pilihanUser=userInput.next();

        switch (pilihanUser) {
            case "1":
                System.out.println("\n=================");
                System.out.print("LIST SELURUH BUKU");
                System.out.println("\n=================");
                tampilkanData(lanjutkan);
                break;
            case "2":
                System.out.println("\n==============");
                System.out.print("CARI DATA BUKU");
                System.out.println("\n==============");
                break;
            case "3":
                System.out.println("\n================");
                System.out.print("TAMBAH DATA BUKU");
                System.out.println("\n================");
                break;
            case "4":
                System.out.println("\n==============");
                System.out.print("UBAH DATA BUKU");
                System.out.println("\n==============");
                break;
            case "5":
                System.out.println("\n===============");
                System.out.print("HAPUS DATA BUKU");
                System.out.println("\n===============");

                break;
            default:
                System.err.println("\nInput anda tidak ditemuham\nSilahkan masukan angka 1-5: ");
        }

           lanjutkan = yesOrNo("\nApakah anda ingin melanjutkan");
        }

    }
    private static void tampilkanData(boolean tambah)throws IOException{
        System.out.println("kita akan tampilkan data");
         tambah=true;
         tambah=yesOrNo("Apakah anda ingin menambahkan data");


    }
    private static boolean yesOrNo(String massage){
        Scanner userInput = new Scanner(System.in);
        System.out.print(massage+" (y/n)? ");
        String masukanUser=userInput.next();
        while (!masukanUser.equalsIgnoreCase("y")&&!masukanUser.equalsIgnoreCase("n")){
            System.err.println("\npilihan anda bukan y atau n");
            System.out.print(massage+" (y/n)? ");
             masukanUser=userInput.next();
        }
        return masukanUser.equalsIgnoreCase("y");

    }
    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.println("\033\143");
            }
        }catch (Exception e){
            System.err.println("tidak bisa clear screen");
        }
    }
}
