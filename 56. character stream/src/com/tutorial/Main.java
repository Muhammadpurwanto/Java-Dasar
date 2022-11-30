package com.tutorial;

import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {

        //membuka file
        //byte stream      -->FileInputStream
        //character stream -->FileReader

        FileInputStream byteFileInput=new FileInputStream("input.text");
        FileReader      charFileInput =new FileReader("input.text");

        FileOutputStream byteFileOutput=new FileOutputStream("output.text");
        FileWriter charFileOutput =new FileWriter("output.text");

        //membaca file
        //byte file
        int buffer= byteFileInput.read();
        while (buffer!=-1){
            System.out.print((char) buffer);
           byteFileOutput.write(buffer);
           buffer=byteFileInput.read();
        }
        System.out.println("\n\n");
        //char file
        int buffer1= charFileInput.read();
        while (buffer1!=-1){
            System.out.print((char) buffer1);
            charFileOutput.write(buffer1);
            buffer1=charFileInput.read();
        }


        //menutup file
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();
    }
}
