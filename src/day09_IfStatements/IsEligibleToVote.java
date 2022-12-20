package day09_IfStatements;

public class IsEligibleToVote {

    public static void main(String[] args) {

        String name = "Adam";
        int age = 25;

        if (age >= 21){
            System.out.println(name + " is eligible to vote");
        }else {
            System.out.println(name + " is not eligible to vote");
        }


    }


}
