package com.kise.Program;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        int temp = a; // a value in temp
        a = b; // a value is 20
        b = temp; // b value is 10 from temp ^
        System.out.println(a + " " + b);
    }
}
