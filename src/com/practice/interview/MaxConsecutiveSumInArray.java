package com.practice.interview;

public class MaxConsecutiveSumInArray {
    public static void main(String[] args) {
        int[] num = {4, 6, 2, 4, 9, 0, 7, 8, -9, 2, 9, 1, 6, 9};
        int k = 3;
        System.out.println(maxSum(num, k));
    }

    private static int maxSum(int[] num, int k) {
        int sum = 0, mSum;
        for (int i = 0; i < k; i++) {
            sum += num[i];
        }
        mSum = sum;
        for (int i = k; i < num.length; i++) {
            sum += num[i] - num[i - k];
            mSum = Math.max(sum, mSum);
        }
        return mSum;
    }
}
