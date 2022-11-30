package com.tutorial;

import java.io.*;
import java.time.Year;
import java.util.Arrays;
import java.util.Locale;
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
                    cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.print("TAMBAH DATA BUKU");
                    System.out.println("\n================");
                    tambahData();
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
    private static void tambahData()throws IOException{

        FileWriter fileOutput=new FileWriter("database",true);
        BufferedWriter bufferedOutput =new BufferedWriter(fileOutput);
        Scanner terminalInput=new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("masukan nama penulis: ");
        penulis=terminalInput.nextLine();


        System.out.print("masukan judul buku: ");
        judul=terminalInput.nextLine();


        System.out.print("masukan penerbit buku: ");
        penerbit=terminalInput.nextLine();


        System.out.print("masukan tahun buku: ");
        tahun =ambilTahun();
       

        bufferedOutput.close();

    }
    private static String ambilTahun()throws IOException{
        boolean tahunValid=false;
        Scanner terminalInput=new Scanner(System.in);
        String tahunInput=terminalInput.nextLine();
        while (!tahunValid){
            try {
                Year.parse(tahunInput);
                tahunValid=true;
            }catch (Exception e) {
                System.out.print("masukan tahun lagi: ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
            }
        return tahunInput;
    }
    private static void cariData()throws  IOException{
        //membaca data base ada atau gak
        try {
            File file =new File("database");
        }catch (Exception e) {
            System.err.println("data base tidak di temukan");
            System.err.println("silahkan tambah data terlebih dahulu");
            return;

        }
        //kita ambil keyword dari data base
        Scanner inputan=new Scanner(System.in);
        System.out.println("masukan kata kunci untuk mencari buku: ");
        String cariString=inputan.nextLine();
        String keyword[]=cariString.split("\\s+");

        cekBuku(keyword);

        //kita cek keyword di data base



    }
    private static void cekBuku(String keywords[])throws IOException{
        FileReader fileInput=new FileReader("database") ;
        BufferedReader bufferedInput=new BufferedReader(fileInput);
        String data=bufferedInput.readLine();
        boolean exist;
        int nomor=0;
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("==================================================================================");
        while (data !=null){
            //cek keyword didalam baris

            exist=true;
            for (String keyword:keywords){
                exist=exist&&data.toLowerCase().contains(keyword.toLowerCase());
            }
            //jika keyword cocok maka tampilkan

            if(exist){
                nomor++;
                StringTokenizer token = new StringTokenizer(data, ",");
                token.nextToken();
                System.out.printf("| %d  ", nomor);
                System.out.printf("|\t%s  ", token.nextToken());
                System.out.printf("|\t%-20s   ", token.nextToken());
                System.out.printf("|\t%-20s   ", token.nextToken());
                System.out.printf("|\t%s   ", token.nextToken());
                System.out.print("\n");
            }



            data=bufferedInput.readLine();
        }

        System.out.println("=================================================================================");
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

