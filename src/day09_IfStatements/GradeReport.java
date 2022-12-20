package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int grade = 85;
        char score;

        if (grade > 90 && grade <= 100){
            score = 'A';
        } else if (grade > 80 && grade <= 89) {
            score = 'B';
        } else if (grade > 70 && grade <= 79) {
            score = 'C';
        } else if (grade > 60 && grade <= 69) {
            score = 'D';
        }else {
            score = 'F';
        }

        System.out.println("score = " + score);


    }



}
