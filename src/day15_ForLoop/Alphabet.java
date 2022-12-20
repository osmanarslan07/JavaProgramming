package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        // A~Z
        for (char ch = 'A'; ch <= 'Z'; ch += 1) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        // a~z
        for (char ch = 'a'; ch <= 'z'; ch += 1) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        // Z~A
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");

        }

        System.out.println();
        System.out.println("-------------------------------");

        // z~a
        for (char ch = 'z'; ch >= 'a'; ch--) {
            System.out.print(ch + " ");

        }

        System.out.println();
        System.out.println("-------------------------------");

        for (char i = 1; i <= 40000; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        /*
        1. print the following shape:

		        * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
         */



        for (int i = 1; i<=8 ; i++ ){
            System.out.print("* ".repeat(6)+"\n");
        }

        System.out.println();
        System.out.println("-------------------------------");

        /*
 2. Write a method which prints out the numbers from 1 to 100 but
 for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
 for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5,
 print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

         */

        for (int i = 1; i<=100; i++){

            if (i%3==0 && i%5==0 ){
                System.out.print("FINRA"+" ");
            } else if (i%5==0) {
                System.out.print("RA"+" ");
            } else if (i%3==0) {
                System.out.print("FIN" + " ");
            }else {
                System.out.print(i + " ");
            }



        }

        System.out.println();



    }

}
