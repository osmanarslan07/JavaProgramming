package day19_LoopPractices;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "aaabbcccdeeeffhh";
        //            012345678
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str. charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);

                if (ch == each){
                    count++;
                }
            }

            if (count==1){
                if (!(result.contains(ch+""))) {
                    result += ch;
                }
            }

        }

        System.out.println(str.indexOf(result.charAt(0)));

    }
/*
4. Write a program that can return the index number of the first unique character.
 */

}
