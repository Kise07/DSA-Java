package com.kise.Program;

public class CountNums {
    public static void main(String[] args) {
        int n = 155345;

        int count = 0; // Counting Occurrence
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) { // Check for target
                count++;
            }
            n = n / 10;
        }
        System.out.println(count); // -> 3
    }
}
