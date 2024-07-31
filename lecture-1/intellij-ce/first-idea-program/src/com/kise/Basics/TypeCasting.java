package com.kise.Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt(); // 6 -> 6
//        float num = input.nextInt(); // 7 -> 7.0 *Greater value can typecast*
//        System.out.println(num);

        // TypeCasting:-
        int num = (int)(57.9f); // -> 57
        System.out.println(num);
    }
}
