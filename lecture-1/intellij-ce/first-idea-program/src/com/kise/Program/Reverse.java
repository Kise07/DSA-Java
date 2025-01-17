package com.kise.Program;

public class Reverse {
    public static void main(String[] args) {
        int n = 12345;

        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem; // initial 0 -> 5+4+3+2+1
        }

        System.out.println(ans); // -> 54321
    }
}
