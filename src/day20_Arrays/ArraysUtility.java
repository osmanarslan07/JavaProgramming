package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {10, 12, 7, 98, 1, 5, 76, 19, 2, 1};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // sorts the array in ascending order

        System.out.println(Arrays.toString(numbers));

    }

}
