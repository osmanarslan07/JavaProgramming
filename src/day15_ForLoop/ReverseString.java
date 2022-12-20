package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Java";
        //            0123

        for (int i = 1; i < 5; i++) {
            char reverse = str.charAt(str.length()-i);
            System.out.print(reverse);
        }



    }
/*
1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */
}
