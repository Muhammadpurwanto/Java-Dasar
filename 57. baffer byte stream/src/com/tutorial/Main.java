package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        long waktuStart, waktuFinis;
        //membaca dari file
        FileInputStream byteFile=new FileInputStream("input.text");
        System.out.println(byteFile.available());

        //menghitung waktu pembacaan
        waktuStart=System.nanoTime();
        System.out.println(byteFile.readAllBytes());
        waktuFinis=System.nanoTime();
        System.out.println("waktu = "+(waktuFinis-waktuStart));
        byteFile.close();

        //membaca dari memory
        FileInputStream byteInput2=new FileInputStream("input.text");
        BufferedInputStream bufferInput =new BufferedInputStream(byteInput2);

        bufferInput.mark(200);
        //menghitung waktu pembacaan
        waktuStart=System.nanoTime();
        System.out.println(bufferInput.readAllBytes());
        waktuFinis=System.nanoTime();
        System.out.println("waktu = "+(waktuFinis-waktuStart));


        //baca ulang
        bufferInput.reset();
        byte data[]=bufferInput.readAllBytes();
        String dataString =new String(data);
        System.out.println(dataString);
        bufferInput.close();
        byteInput2.close();

        //memulai dengan output
        FileOutputStream byteOutput=new FileOutputStream("output");
        BufferedOutputStream bufferedOutput=new BufferedOutputStream(byteOutput);

        //write data berupa byte
        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();
        bufferedOutput.close();
        byteOutput.close();
    }
}
