package com.kise.Array_ArrayLists;

import java.util.Arrays;

public class SwapArrayIndex {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 23, 9, 18};
        int[] arr = {1, 3, 23, 9, 18, 56};
        System.out.println(Arrays.toString(arr)); // [1, 3, 23, 9, 18]
//        swap(arr, 0, 4);
//        System.out.println(Arrays.toString(arr)); // [18, 3, 23, 9, 1]
        reverse(arr);
        System.out.println(Arrays.toString(arr)); // [18, 9, 23, 3, 1] [56, 18, 9, 23, 3, 1]
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
