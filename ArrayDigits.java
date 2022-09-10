package com.konor.HomeWorkPracticeOther7;

import java.util.ArrayList;
import java.util.List;

public class ArrayDigits {
    public static List<Integer> arrayDigits(int low, int high) {
        String digits = "123456789";

        List<Integer> result = new ArrayList<>();

        for (int length = 1; length <= 9; length++) {
            for (int i = 0; i + length <= digits.length(); i++) {
                String substring = digits.substring(i, i + length);
                int value = Integer.parseInt(substring);

                if (value >= low && value <= high) {
                    result.add(value);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(arrayDigits(100, 400));
        System.out.println(arrayDigits(1000, 13000));
    }
}
