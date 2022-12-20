package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //Wooden SpoonEnter

        System.out.println("Enter your programming language: ");
        String program = input.nextLine(); //Java Programming LanguageEnter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 24

        input.nextLine(); //Enter

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine(); //Enter

        input.close();

        System.out.println("fullName = " + fullName);
        System.out.println("program = " + program);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);





    }

}
