package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {
            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("ArithmeticException was occurred");

        }

        System.out.println("Test1 Completed");

        System.out.println("------------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        System.out.println(numbers[200]);



        System.out.println("Test2 Completed");






    }



}
