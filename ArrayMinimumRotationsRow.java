package com.konor.HomeWorkPracticeOther7;

public class ArrayMinimumRotationsRow {
    public static int minDominoRotations(int[] A, int[] B) {
        int ans = -1;
        for (int val = 1; val <= 6; val++) {
            int currAns = helper(A, B, val);

            if (currAns != -1 && (ans == -1 || ans > currAns)) {
                ans = currAns;
            }
        }
        return ans;
    }

    private static int helper(int[] A, int[] B, int val) {
        int ansTop = 0;
        int ansBottom = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != val && B[i] != val) {
                return -1;
            } else if (A[i] != val) {
                ansTop++;
            } else if (B[i] != val) {
                ansBottom++;
            }
        }
        return Math.min(ansTop, ansBottom);
    }

    public static void main(String[] args) {
        //int[] tops = {2, 1, 2, 4, 2, 2};
        //int[] bottoms = {5, 2, 6, 2, 3, 2};

        int[] tops = {3, 5, 1, 2, 3};
        int[] bottoms = {3, 6, 3, 3, 4};
        System.out.println(minDominoRotations(tops, bottoms));
    }

}
