package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
                    tampilkanData();
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
    private static void tampilkanData()throws IOException{
        FileReader membacaInput;
        BufferedReader membacaBuffered;
        try {
            membacaInput=new FileReader("database");
            membacaBuffered=new BufferedReader(membacaInput);
        }catch (Exception e){
            System.err.println("data base tidak di temukan");
            System.err.println("silahkan tambah data terlebih dahulu");
            return;
        }
        String data=membacaBuffered.readLine();
        int nomor=0;
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("==================================================================================");

        while (data !=null) {
            nomor++;
            StringTokenizer token = new StringTokenizer(data, ",");
            token.nextToken();
            System.out.printf("| %d  ", nomor);
            System.out.printf("|\t%s  ", token.nextToken());
            System.out.printf("|\t%-20s   ", token.nextToken());
            System.out.printf("|\t%-20s   ", token.nextToken());
            System.out.printf("|\t%s   ", token.nextToken());
            System.out.print("\n");
            data=membacaBuffered.readLine();
        }
        System.out.println("=================================================================================");
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
