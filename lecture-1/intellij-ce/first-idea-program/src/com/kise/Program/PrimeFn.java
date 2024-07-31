package com.kise.Program;

import java.util.Scanner;

public class PrimeFn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n); // Q1
//        System.out.println(ans);

//        System.out.println(isArmstrong(n)); // Q2 by user input
        for (int i = 100; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " "); // -> 153 370 371 407
            }
        }
    }
// Q2 -> Armstrong Number fn
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return  sum == original;
    }

// Q1 -> Prime Number by User Inputs
    static boolean isPrime(int n) {
        if (n <= 1) { // Check for input less than 0
            return false;
        }
        int c = 2;
        while (c * c <= n) { // Trigger Event
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n; // short-handed true / false
    }
}
