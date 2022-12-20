package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        /*
        for (char i = 'A', j= 0 ;  i<= 'Z' && j< letters.length ; i++ , j++){
                letters[j] = i;
        }
*/

        char ch= 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i]=ch;
        }

        System.out.println(Arrays.toString(letters)); // [A~Z]


        System.out.println("------------------------------");

        char letters2[] = new char[26];

        char ch2 = 'Z';
        for (int j = 0; j < letters2.length; j++, ch2--) {
            letters2[j] = ch2;
        }

        System.out.println(Arrays.toString(letters2));



    }


}
