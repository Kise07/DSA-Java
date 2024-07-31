package com.kise.Searching;

public class LinearSearchBasics {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch1(nums, target);
        boolean ans1 = linearSearch3(nums, target); // 3-type
        System.out.println(ans1);
        System.out.println(ans);

    }
    // 3-search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        // Check if the Array is empty?
        if (arr.length == 0) {
            return false;
        }
        // Run For Loop
        for (int index = 0; index < arr.length; index++) {
            // Check for the element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        // this line will be execute if the return statements above have executed
        // hence the target not found.
        return false;
    }

//    // 2-search the target and return the element itself
//    static int linearSearch2(int[] arr, int target) {
//        // Check if the Array is empty?
//        if (arr.length == 0) {
//            return -1;
//        }
//        // Run For Loop
//        for (int index = 0; index < arr.length; index++) {
//            // Check for the element at every index if it is = target
//            int element = arr[index];
//            if (element == target) {
//                return element;
//            }
//        }
//        // this line will be execute if the return statements above have executed
//        // hence the target not found.
//        return -1;
//    }

    // 1-search in the array: return the index if item found
    // otherwise if target not found return -1
    static int linearSearch1(int[] arr, int target) {
        // Check if the Array is empty?
        if (arr.length == 0) {
            return -1;
        }
        // Run For Loop
        for (int index = 0; index < arr.length; index++) {
            // Check for the element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will be execute if the return statements above have executed
        // hence the target not found.
        return -1;
    }
}
