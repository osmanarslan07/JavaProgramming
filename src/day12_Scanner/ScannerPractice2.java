package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

     /*   System.out.println("Enter true or false");
        boolean result =  input.nextBoolean(); // you can enter true or false, nothing else */

        System.out.println("Enter your name: ");
        String name =  input.next(); // reads the input until a space
        input.close();

        System.out.println("name = " + name); // Java




    }
}
