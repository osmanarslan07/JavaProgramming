package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your gender");
        String gender = scan.nextLine();


        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); // if the previous scanner method that's used is not nextLine(), then we need to provide one more next line method

        System.out.println("Enter your phone number ");
        long phone = scan.nextLong();

        System.out.println("Enter your zip code");
        int zipCode= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your School name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.next();

        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();
        scan.close();

        System.out.println("Full name = " + fullName);
        System.out.println("age = " + age);
        System.out.println("phone number = " + phone);
        System.out.println("Address : \n\t"+buildingNumber+" "+streetName+"\n\t"+city+", "+state+" "+zipCode );
        System.out.println("school name = " + schoolName);





    }
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name

		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name

 */

}
