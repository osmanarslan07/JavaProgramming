package day07_Operators;

public class NumberOfDaysInAMonth {

    public static void main(String[] args) {

        int number = 5;  // 1 ~ 12


        boolean has30Days = number == 4 ||number == 6 || number == 9 || number == 11;
        boolean has28Days = number == 2; // for the month has 28 days
        boolean has31days = number == 1 ||number == 3 || number == 5 || number == 7 ||number == 8 || number == 10 || number == 12;
        //boolean has31days = !has28Days && !has30Days; // if the month does not have 28 days and does not have 30 days

        if (has31days){ // if the month has 31 days
            System.out.println("31 days");
        }
        if (has30Days){ // if the month has 30 days
            System.out.println("30 days");
        }
        if (has28Days){ // if the month has 28 days
            System.out.println("28 days");
        }

    }
    /*
    3. Write a program that can print the number of days in a month
			Ex:
				number = 1 ~ 12;

			output:
				31 Days

			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
     */

}
