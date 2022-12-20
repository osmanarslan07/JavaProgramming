package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = sumOf2Numbers(10,20);

        System.out.println("sum = " + sum);

        int sum2 = sumOf3Numbers(10,20,30);

        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf4Numbers(10,20,30,40);

        System.out.println("sum3 = " + sum3);
    }


    public static int sumOf2Numbers(int a, int b){
        return a + b;
    }

    public static int sumOf3Numbers(int a, int b, int c){
        return a + b + c;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d){
        return a + b + c + d;
    }





/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */


}
