package com.tutorial;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {

        StringBuilder builder= new StringBuilder("hallo");
        printData(builder);

  //append
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga surabaya");
        printData(builder);

   //insert
        builder.insert(20," kota");
        printData(builder);

   //delete
        builder.delete(20,25);
        printData(builder);



    }
    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = "+dataBuilder);
        System.out.println("panjang = "+dataBuilder.length());
        System.out.println("kapasitas = "+dataBuilder.capacity());

        int addres = System.identityHashCode(dataBuilder);
        System.out.println("addres = "+Integer.toHexString(addres));
    }
}
