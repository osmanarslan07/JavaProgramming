package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

       /* String name = "Osman";
        String buildingNumber = "403A";
        String streetName = "Yalı Caddesi";
        String city = "Antalya";
        String state = "Muratpaşa";
        String zipCode = "7200";
*/

        String name = "Osman Arslan",
                buildingNumber = "403A",
                streetName = "Yalı Caddesi",
                city = "Antalya",
                state = "Muratpasa",
                zipCode = "7200A";

       /* System.out.println(name + "\n" + buildingNumber  + " " + streetName
        + "\n" + city + ", " + state + " " + zipCode);
*/

        String address = name + "\n" + buildingNumber  + " " + streetName
                + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);






    }
    /*
    1. Create a class called ShippingAddress.java
    2. Declare the following variables:

1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode

    3. Use concatenation to print the full address
     */

}
