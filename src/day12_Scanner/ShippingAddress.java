package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine(); //Java Programming

        System.out.println("Enter your building number");
        String buildingNumber = input.next(); // 7925A
        input.nextLine();

        System.out.println("Enter your street name");
        String streetName = input.nextLine(); //Honor street

        System.out.println("Enter your city name");
        String cityName = input.nextLine(); //Antalya

        System.out.println("Enter your state");
        String state = input.next(); // Muratpaşa

        System.out.println("Enter your zip code");
        String zipCode = input.next();
        input.close();

        System.out.println(fullName + "\n"+streetName +" "+ buildingNumber +"\n"+ cityName +" "+ state +" "+ zipCode);





    }
/*
1. Enter your name (nextLine())
2. Enter your building number (next())
3. Enter your street name (nextLine())
4.Enter your city name (nextLine())
5.Enter your state (next())
6. Enter your zip code (next())

Display the shipping adress

 */


}
