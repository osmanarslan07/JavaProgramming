package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your hourly rate");
        scan.nextInt();
        int hourlyRate = scan.nextInt();

        System.out.println("How many hours do you work in a week?");
        scan.nextInt();
        int hoursInAWeek = scan.nextInt();

        System.out.println("Enter the state tax");
        scan.nextDouble();
        double stateTaxRate = scan.nextDouble();

        System.out.println("Enter the federal tax");
        scan.nextDouble();
        double federalTaxRate = scan.nextDouble();

        scan.close();

        double salary = hourlyRate*hoursInAWeek*52;
        double stateTax = salary*stateTaxRate;
        double federalTax = salary*federalTaxRate;
        double totalTax = stateTax+federalTax;
        double netIncome = salary-totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);


    }
/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

 */

}
