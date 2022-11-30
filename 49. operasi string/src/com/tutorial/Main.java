package com.tutorial;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

String kata= "saya suka makan pisang";
//mengambil komponen dari string
        System.out.println(kata.charAt(3));

//substring
        String kalimat=kata.substring(10,16);
        System.out.println(kalimat);

//concatenation
        String kata2=kalimat +"cireng";
        System.out.println(kata2);

//concat dengan non string
        int a =20;
        System.out.println(kata2+" "+a);

//lowercase dan uppercase
        String kata3=kata.toUpperCase();
        System.out.println(kata3);
        String kata4=kata3.toLowerCase();
        System.out.println(kata4);

//replace
        String kata5=kata.replace("pisang","mendoan");
        System.out.println(kata5);

//equality (persamaan)
         //String kataInput  = "test";
         //String kataInput = new String("test");//ini di hepp
         String kataTest = "test";//ini di string pool

            Scanner userInput=new Scanner(System.in);
            System.out.print("user input: ");
            String kataInput= userInput.next();
    if(kataInput.equals(kataTest)){
            System.out.println("sama");
    }else{
            System.out.println("beda");
    }

    }
}
