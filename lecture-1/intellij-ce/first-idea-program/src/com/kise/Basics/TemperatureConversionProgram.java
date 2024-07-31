package com.kise.Basics;

import java.util.Scanner;

public class TemperatureConversionProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32; // Formula
        System.out.println(tempF); // Please enter temp in C: 40 -> 104.0
    }
}
