package day12_Scanner;

public class GradeLevel1 {

    public static void main(String[] args) {

        byte grade = 6;
        String result = "";

        switch (grade){

            case 1: case 2: case 3: case 4: case 5:
                result="Elementary school";
                break;

            case 6: case 7: case 8:
                result="Middle school";
                break;
            case 9: case 10: case 11: case 12:
                result="High school";
                break;

            case 13: case 14: case 15: case 16:
                result="College";
                break;

            case 17: case 18:
                result="College";
                break;

            default:
                result="Invalid grade level given";

        }

        System.out.println(result);

/*
        if (grade>=1 && grade <=18){

            switch (grade){

                case 6: case 7: case 8:
                    result="Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    result="High school";
                    break;

                case 13: case 14: case 15: case 16:
                    result="College";
                    break;

                case 17: case 18:
                    result="College";
                    break;

                default:
                    result="Elementary school";

            }

        }else {
            result="Invalid grade level given";
        }


        System.out.println(result);
*/

    }
/*
 1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both
 */

}
