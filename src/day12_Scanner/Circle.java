package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        scan.nextDouble();

        double radius = scan.nextDouble();
        scan.close();
        double pi = 3.14;

        double area = radius*radius*pi; // perimeter = 2.(pi).r // area = (pi).r.r
        double perimeter = 2*pi*radius;

        System.out.println("radius = " + radius);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
    /*
    1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

     */
}
