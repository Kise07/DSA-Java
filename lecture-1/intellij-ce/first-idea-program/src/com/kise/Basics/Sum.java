package com.kise.Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("Sum is " + sum); // 21 7 -> Sum is `28.0` *TypeCasting*
    }
}
