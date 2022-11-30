package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[]args){
    Scanner inputUser=new Scanner(System.in);
    float a,b,hasil;
    String operator;
        System.out.print("nilai a = ");
        a= inputUser.nextFloat();
        System.out.print("operator = ");
        operator= inputUser.next();
        System.out.print("nilai b = ");
        b= inputUser.nextFloat();
switch (operator) {
    case "+":
        hasil = a + b;
        System.out.println("hasil = " + hasil);
        break;
    case "-":
        hasil = a - b;
        System.out.println("hasil = " + hasil);
        break;
    case "*":
        hasil = a * b;
        System.out.println("hasil = " + hasil);
        break;
    case "/":
        hasil = a /b;
        System.out.println("hasil = " + hasil);
        break;
    default:
        break;

}

    }
}
