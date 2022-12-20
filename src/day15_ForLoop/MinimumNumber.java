package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);
        int min = 2147483647; // any user entered number   will be less than 2147483647

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = scan2.nextInt(); // 1, 2, 3, 4, 5

            if (num < min){ // if the user entered number is less than current maximum number
                min = num;
            }


        }
        System.out.println("min = " + min);


    }
    /*
Write a program that asks user to enter a number for 5 times,
return the minimum number.
 */
}
