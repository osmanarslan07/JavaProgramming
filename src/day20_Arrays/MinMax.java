package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        int j = 10;
        for (int i = 0; i < 10; i++, j--) {
            System.out.println("("+j+" number left) Enter a number: ");
            numbers[i] = scan.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min = numbers[i];
            }

            if (numbers[i]>max){
                max = numbers[i];
            }
        }


        System.out.println(Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        scan.close();




    }
/*
. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */

}
