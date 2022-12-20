package day19_LoopPractices;

public class IndexNumberOfFirstDuplicate {

    public static void main(String[] args) {

        String str = "abcccdd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);

                if (ch==each){
                    count++;
                }
            }

            if (count>=2){
                result+=ch;
            }

            if (result.length()==1){
                break;
            }

        }
        System.out.println(str.indexOf(result.charAt(0)));



    }
/*
Write a program that cna return the index number of the first duplicated character from a string
 */
}
