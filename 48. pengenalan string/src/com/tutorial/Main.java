package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //membuat string
    String kataString = "hallo";
    char kataChar[] = {'h','a','l','l','o'};

    //menampilkan string
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        //mengakses komponen
        System.out.println("komponen pertama dari string = " + kataString.charAt(0));
        System.out.println("komponen pertama dari char = "+ kataChar[0]);

        //mengubah komponen
        kataChar[0]='c';
       // kataString[0]="c";               //TIDAK BISA MENGUBAH KOMPONEN STRING
      //  kataString.charAt(0)="c";
        System.out.println(Arrays.toString(kataChar));
        System.out.println("c"+kataString.substring(1,5));


        String str1="test";
        String str2="test";



        printAddres("str1",str1);
        printAddres("str2",str2);
        printAddres("kata string",kataString);
    }
    private static void printAddres(String nama, String data){
        int addres= System.identityHashCode(data);
        System.out.println(nama +" + "+data+"\t|| addres = "+Integer.toHexString(addres));
    }

}
