package com.kise.Array_ArrayLists;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 4, 5));
    }
    // 1-Maximum in whole array
    private static int max(int[] arr) {
        if (arr.length == 0) { // Edge Case
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // 2-Maximum btw certain indexes
    private static int maxRange(int[] arr, int start, int end) {
        if (end > start) { // Edge Case
            return -1;
        }
        if (arr == null) { // Edge Case
            return -1;
        }
        int maxVal = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
