package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("panjang = ");
        int panjang = userInput.nextInt();
        System.out.print("lebar = ");
        int lebar = userInput.nextInt();
        gambar(panjang, lebar);
        keliling(panjang, lebar);
        luas(panjang,lebar);
    }

    public static void gambar(int panjang, int lebar) {
        for (int i = 0; i <lebar; i++) {

            for (int j = 0; j <panjang; j++) {
            System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static int keliling(int panjang, int lebar) {
        int hasil = (panjang + lebar) * 2;
        System.out.println("keliling = " + hasil);
        return hasil;
    }
    public static int luas(int panjang, int lebar) {
        int hasil = (panjang * lebar) ;
        System.out.println("luas = " + hasil);
        return hasil;
    }
}




