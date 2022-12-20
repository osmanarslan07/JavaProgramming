package day16_forLoopStringPractice;

public class DigitsLetterSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!   #$%WoodenSpoon";

        String digits= "";//12345
        String letters ="";// CydeoWoodenSpoon
        String specialChars = ""; // !#$%

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (0 ~ last index)

            char ch = str.charAt(i); // ch : each character that we have in str

            if (ch >= '0' && ch <= '9'){ // if the character is between '0' and '9' then it's digit
                digits += ch;
            } else if (ch >='A' && ch<='Z') { // if the character is between 'A' and 'Z' then it's letter
                letters += ch;
            }else if (ch >='a' && ch<='z'){ // if the character is between 'a' and 'z' then it's letter
                letters += ch;
            }else { // if the character is neither digit nor letter, then it's special character
               if (ch!=' ') { // if the special character is not a space
                   specialChars += ch;
               }
            }



        }
        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);

    }


}
