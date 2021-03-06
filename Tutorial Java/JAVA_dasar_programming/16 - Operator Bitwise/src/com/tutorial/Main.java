package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Operator Bitwise --> operator unutk melakukan operasi pada nilai bit

        byte a = 3;
        byte b,c;
        String a_bits,b_bits,c_bits;



        // Operator SHIFT LEFT
        System.out.println("====== SHIFT LEFT (<<) =====");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        // Operator SHIFT RIGHT
        System.out.println("====== SHIFT RIGHT (>>) =====");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a >> 2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        // Operator bitwese OR
        System.out.println("====== BITWASE OR (|) =====");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("-----------------OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

        // Operator bitwese AND
        System.out.println("====== BITWASE AND (&) =====");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("-----------------AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

        // Operator bitwese XOR
        System.out.println("====== BITWASE XOR (^) =====");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("-----------------XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

        // Operator Negasi / Not
        System.out.println("====== BITWASE NOT (~) =====");
        a = 24;
        b = (byte)(~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        System.out.println("-----------------NOT");
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n",b_bits, b);
    }
}
