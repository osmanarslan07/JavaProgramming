package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean LeapYear = year%4 == 0;

        if (LeapYear){
            System.out.println("Year " + year + "is leap year.");
        }

        if (!LeapYear){
            System.out.println("Year " + year + "is not leap year.");
        }


        System.out.println("----------------------------------");

        if (LeapYear){
            System.out.println("Year " + year + "is leap year.");
        }else {
            System.out.println("Year " + year + "is not leap year.");
        }



    }



}
