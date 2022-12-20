package day17_While_DoWhile;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';
        int frequency = 0;


        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i); //eachChar : each character of str

           if (eachChar==ch){ // if given ch is matching with the eachChar, then ch is appeared in the string
                frequency++;
           }

        }

        System.out.println(frequency);

    }
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */

}
