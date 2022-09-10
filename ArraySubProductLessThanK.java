package com.konor.HomeWorkPracticeOther7;

public class ArraySubProductLessThanK {
    public static int numProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int count = 0;
        int left = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            while (prod >= k) {
                prod /= nums[left++];
            }
            count += i - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;

        //int[] nums = {1, 2, 3};
        //int k = 0;
        System.out.println(numProductLessThanK(nums, k));
    }
}
