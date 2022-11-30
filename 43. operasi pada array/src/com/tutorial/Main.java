package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int angka1[]={1,2,3,4,5};

        //merubah array menjadi string
        printArray(angka1);

        //mengcopy array
        System.out.println("\nmengcopy array");
        int angka2[]=new int[5];
        printArray(angka1);
        printArray(angka2);

        //mengcopy dengan loop
        System.out.println("\nmengcopy dengan loop");
        for(int i=0;i<angka1.length;i++) {
            angka2[i] = angka1[i];
        }
            printArray(angka1);
            printArray(angka2);

        //mengcopy dengan copyOf
        System.out.println("\nmengcopy dengan copyOf");
        int angka3[]=Arrays.copyOf(angka1,3);
        printArray(angka1);
        printArray(angka3);

        //mengcopy dengan copyOfRange
        System.out.println("\nmengcopy dengan copyOfRange");
        int angka4[]=Arrays.copyOfRange(angka1,2,4);
        printArray(angka1);
        printArray(angka4);

        //fill array
        System.out.println("\nfill array");
        int angka5[]=new int[10];
        printArray(angka5);
        Arrays.fill(angka5,4);
        printArray(angka5);

        //komparasi array
        System.out.println("komparasi array");
        int angka6[]={1,3,3,4,5};
        int angka7[]={1,2,3,4,9};
        System.out.println(Arrays.equals(angka6,angka7));

        //mengecek array yg lebih besar
        System.out.println("\nmengecek array yang lebih besar");
        System.out.println(Arrays.compare(angka6,angka7));

        //mengecek index yang lebih besar
        System.out.println("\nmengecek index yang lebih besar");
        System.out.println(Arrays.mismatch(angka6,angka7));

        //sort array
        System.out.println("\nsort array");
        int angka8[]={1,4,2,6,4,7,8};
        printArray(angka8);
        Arrays.sort(angka8);
        printArray(angka8);

        //search array
        System.out.println("\nsearch array");
        int angka=6;
        printArray(angka8);
        System.out.println("angka "+angka+" ada di index "+Arrays.binarySearch(angka8,angka));
        }
        private static void printArray(int dataArray[]){
        System.out.println("array = " +Arrays.toString(dataArray));
    }
}
