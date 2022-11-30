package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[]args){
   Scanner inputUser= new Scanner(System.in);
  float a,b,hasil;
  char operator;
        System.out.print("nilai a = ");
        a= inputUser.nextFloat();
        System.out.print("nilai operator = ");
        operator= inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b= inputUser.nextFloat();

        //penjumlahan
        if(operator == '+'){
            hasil = a + b;
            System.out.println("hasil = "+hasil);
        }  //pengurangan
        if(operator == '-'){
            hasil = a - b;
            System.out.println("hasil = "+hasil);
        }  //perkalian
        if(operator == '*'){
            hasil = a * b;
            System.out.println("hasil = "+hasil);
        }  //pembagian
        if(operator == '/'){
            hasil = a / b;
            System.out.println("hasil = "+hasil);
        }
    }




}
