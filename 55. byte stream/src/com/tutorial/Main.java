package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInput=null;
        FileOutputStream fileOutput=null;

        //membuka file
        fileInput=new FileInputStream("text");

        //membaca file
        int data=fileInput.read();
        while (data!=-1) {
            System.out.println((char) data);
            data=fileInput.read();
        }

        //menutup file
        fileInput.close();

        //
        try {
            //membuka file
            fileInput=new FileInputStream("text2");
            fileOutput=new FileOutputStream("output");

            //membaca file
            int buffer=fileInput.read();

           while (buffer!=-1){
               fileOutput.write(buffer);
               buffer=fileInput.read();
           }


        }finally {
            if(fileInput!=null){
                fileInput.close();
            }
            if(fileOutput!=null){
                fileInput.close();
            }
        }

        //try with resourses
        try (FileInputStream in =new FileInputStream("text")){
            //membaca file
            int data2= in.read();

            while (data2!=-1){
                System.out.println((char) data2);
                data2=in.read();
            }

        }
    }
}
