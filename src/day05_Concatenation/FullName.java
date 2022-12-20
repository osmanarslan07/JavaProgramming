package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Osman";
        String lastName = "Arslan";
        int age = 28;
        String jobTitle = "SDET";
        String companyName = "Amazon.com";
        int salary = 140_000;



        String fullName = firstName + " " + lastName;

        // Full name of the person is ____

        System.out.println("Full name of the person is " + fullName);

        // ____ is ____ years old.

        System.out.println(fullName + " is " + age + " years old.");

        // fullName is jobTitle, works at companyName, and fullName' salary is Salary

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and "
                + fullName + "'s salary is " + "$" + salary);

    }
    /*
    1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
     */
}
