package day09_IfStatements;

public class IsEligibleToBuyAlcohol {

    public static void main(String[] args) {

        String name = "John";
        int age = 18;

        if (age >= 18){
            System.out.println(name + " is eligible to buy alcohol because he is " + age + " years old.");
        }else {
            System.out.println(name + " is not eligible to buy alcohol because he is " + age+ " years old.");
        }


    }


}
