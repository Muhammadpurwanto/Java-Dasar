package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int array[] = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai array ke- ");
        FileInputStream fileInput = null;
        int index = userInput.nextByte();


        //exeption handling, try, cacth, finally
        System.out.println("------handling out of bound------");
       try{
            System.out.printf("index ke- %d, adalah %d",index,array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        //running error jika file tidak ada
        System.out.println("\n------handling IO not found------");
        try{
            fileInput=new FileInputStream("input");
        }catch(IOException e){
            System.err.println(e);
        }

        //menggabungkan 2 exeption
        System.out.println("------menggabungkan 2 exeption------");
        try {
            System.out.printf("index ke- %d, adalah %d", index, array[index]);
            fileInput = new FileInputStream("input");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("index tidak sesuai jumlah array");
        } catch (IOException e) {
            System.err.println("file yang anda masukan tidak ada");
        }
        //finally
        System.out.println("\n------menambahkan finally------");
        try{
            System.out.printf("index ke- %d, adalah %d",index,array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("index tidak sesuai jumlah array");
        }finally {
            System.out.println("\nfinally");
        }

        System.out.println("\nakhir dari progam");
    }
}

