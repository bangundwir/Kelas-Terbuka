package com.tutorial;

public class Main {
    public static void main(String[] args){

        // Program untuk konversi data

        int nilaiInt = 450; // 32-bit
        System.out.println("Nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

        // Memperkecil retnang ke tipe data yang lebih kecil akan menghilangkan nilai aslinya
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = " + nilaiByte); // Menghasilkan nilai aneh
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);

        // Casting pembagian
        float a = 10;
        int b = 4;

        float c = a/b;

        System.out.printf("%f / %d = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float) x / y;
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
