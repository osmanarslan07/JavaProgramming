package day04_Variables;
/*
1. Create a class named Square, write a program that can calculate
the area & perimeter of any given square
side
area = side *
side;
perimeter = 4 *
side
 */

public class Square {
    public static void main(String[] args) {
        // dataType variablename = Data;

        double side = 8.5;

        double perimeterOfSquare = side * 4;
        double areaOfSquare = side * side;

        System.out.println("side = " + side);
        System.out.println("perimeterOfSquare = " + perimeterOfSquare);
        System.out.println("areaOfSquare = " + areaOfSquare);


    }


}
