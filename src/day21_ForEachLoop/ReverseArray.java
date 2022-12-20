package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] reversed = new int[numbers.length]; //{50, 40, 30, 20, 10}

        for (int i = numbers.length-1, j = 0; i >=0 && j < numbers.length ; i--, j++) {

            reversed[i] = numbers[j];

        }
        System.out.println(Arrays.toString(reversed));


    }


}
