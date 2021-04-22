package com.tutorial;

public class Main {

    public static void main(String[] args){

        // unary => operasi yang dilakukan pada satu variable

        // uanary + dan -
        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n",angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);

        // unary increment dan decrement
        int angka2 = 10;
        angka2++;
        System.out.println("Nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("Nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("Nilai dengan '++' frefix menjadi = %d\n", ++a);
        int b = 5;
        System.out.printf("Nilai dengan '++' postfix menjadi = %d\n", b++);
        System.out.printf("Nilai hasil dengan posrfix = %d\n", b);

        // Unary boolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("Nilai boolean = " + ucup);
        System.out.println("Nilai boolean = " + !ucup);
    }
}
