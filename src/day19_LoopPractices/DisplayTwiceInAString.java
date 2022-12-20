package day19_LoopPractices;

public class DisplayTwiceInAString {

    public static void main(String[] args) {

        String str = "abcdeefffgghhhjjkkkllmmmooooonn";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (ch == each){
                    count++;
                }
            }

            if (count==2){
                if (!(result.contains(ch+""))) {
                    result += ch;
                }
            }



        }

        System.out.println(result);

    }
/*
3. Write a program that can display all the characters that appeared twice in the string.
 */


}
