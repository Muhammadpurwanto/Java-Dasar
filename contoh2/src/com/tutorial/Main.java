package com.tutorial;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner userInput=new Scanner(System.in);
        String kata=userInput.next();

        FileInputStream fileInput=new FileInputStream("text");
        FileOutputStream fileOutput=new FileOutputStream("text2");
        fileOutput.write(null)=kata;
        int data=fileInput.read();
        while (data!=-1){
            System.out.print((char) data);
            fileOutput.write(data);
            data=fileInput.read();
        }




    }
}
