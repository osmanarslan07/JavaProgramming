package day17_While_DoWhile;

public class FrequencyOfString {

    public static void main(String[] args) {
        String str = "JavaJavaJava";

        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) {
           String eachSubstring =  str.substring(i, i+4);

           if (eachSubstring.equals("Java")){
                frequency++;
           }

        }

        System.out.println(frequency);


    }
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
 */

}
