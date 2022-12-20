package day09_IfStatements;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 1; // 0~9
        String name = "a";

        if (number == 1){
            name = "One";
        } else if (number==2) {
            name = "Two";
        } else if (number==3) {
            name = "Three";
        } else if (number==4) {
            name = "Four";
        } else if (number==5) {
            name = "Five";
        } else if (number ==6) {
            name = "Six";
        } else if (number==7) {
            name = "Seven";
        } else if (number==8) {
            name = "Eight";
        } else if (number==9) {
            name = "Nine";
        }

        System.out.println("name of the number is = " + name);

    }


    /*
    1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
     */
}
