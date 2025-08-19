package com.practice.interview;

public class BinarySearch {
    private static int searchElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 9, 14, 19, 25, 36, 39, 45, 59, 68, 78, 83, 98};
        int target = 36;
        System.out.println(searchElement(arr, target));
    }
}
