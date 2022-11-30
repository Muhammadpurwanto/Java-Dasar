package com.tutorial;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Contoh {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("input");

        System.out.println((char) file.read());
    }
}
