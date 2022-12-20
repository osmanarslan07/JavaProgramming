package day17_While_DoWhile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {
        String str = "Cat Dog Cat Dog cat cAt CAT";

        int frequency = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String eachSubstring =  str.substring(i, i+3);

            if (eachSubstring.equalsIgnoreCase("Cat")){
                frequency++;
            }

        }

        System.out.println(frequency);


    }


}
