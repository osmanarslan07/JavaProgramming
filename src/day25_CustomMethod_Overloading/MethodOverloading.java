package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {


    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("---------------------------");

        int sum1 = sumOfNumbers(10,20);

        int sum2 = sumOfNumbers(10,20,30);

        int sum3 = sumOfNumbers(10,20,30,40);

        double num4 = sumOfNumbers(18.2, 30.7);

        double num5 = sumOfNumbers(4.5, 5.5, 6.5);

        double sum6 = sumOfNumbers(4.5, 3.5, 2.5, 6.5);




    }

    public static int sumOfNumbers(int a, int b){
        return a + b;
    }

    public static double sumOfNumbers(double a, double b){
        return a + b;
    }

    public static int sumOfNumbers(int a, int b, int c){
        return a + b + c;
    }

    public static double sumOfNumbers(double a, double b, double c){
        return a + b + c;
    }
    
    public static int sumOfNumbers(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static double sumOfNumbers(double a, double b, double c, double d){
        return a + b + c + d;
    }

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }

        result[i] = element;

        return result;
    }

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        }

        result[result.length - 1] = element;

        return result;
    }

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }

        result[result.length - 1] = element;

        return result;
    }

    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;

        }

        result[result.length - 1] = element;

        return result;
    }

}
