package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
      Scanner userInput= new Scanner(System.in);
      int panjang,lebar,luas,tinggi,volume;
        System.out.print("panjang = ");
        panjang= userInput.nextInt();

        System.out.print("lebar = ");
        lebar= userInput.nextInt();

        luas=panjang*lebar;
        System.out.println("luas = "+luas);

        System.out.print("tinggi = ");
        tinggi= userInput.nextInt();

        volume=luas*tinggi;
        System.out.println("volume = "+volume);

    }
}