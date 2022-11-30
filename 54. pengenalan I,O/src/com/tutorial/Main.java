package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

     /* try{
          FileInputStream fileInput=new FileInputStream("text");
      }  catch (Exception e);
        System.out.println(e);*/

        FileInputStream fileInput=new FileInputStream("text");
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());
        System.out.println((char) fileInput.read());

    }
}
