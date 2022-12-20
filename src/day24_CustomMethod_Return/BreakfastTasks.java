package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Osman", "Arslan");

        System.out.println("----------------------------");

        domain("osman.arslan.07@gmail.com");

        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("---------------------------------");

        nameOfMonth(3);

        System.out.println("------------------------------");

        nameOfDay(5);

        System.out.println("---------------------------------");

        howManyDays(7);



    }

    //1. Create a method that can display the initials of the person. initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){
        String initial =firstName.charAt(0)+"."+lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);

    }

    //2. Create a method that can display the domain of the email

    public static void domain(String email){ // cydeo@gmail.com
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        String name = "";

        if (number>=1 && number<=12){

            name = (number==1)? "Jan": (number ==2 )? "Feb": (number ==3 )? "Mar": (number ==4 )? "Apr": (number ==5 )? "May":
                    (number ==6 )? "Jul": (number ==7 )? "Jul": (number ==8 )? "Aug": (number ==9 )? "Sep": (number ==10 )? "Oct":
                            (number ==11 )? "Nov": "Dec";

        }else {
            name = "Invalid";
        }

        System.out.println("Month name = " + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String day = "";

        if (number>=1 && number<=7){

            day = (number==1)? "Mon": (number==2)? "Tue": (number==3)? "Wen": (number==4)? "Thu": (number==5)? "Fri":
                    (number==6)? "Sat": "Sun";

        }else {
            day = "Invalid";
        }

        System.out.println("day = " + day);


    }

    //5. Create a method that can print how many days a month has
    public static void howManyDays( int number1){
        String name2 = "";
        int days = 0;

        if (number1 >=1 && number1 <=12){

            name2 = (number1 ==1)? "Jan": (number1 ==2 )? "Feb": (number1 ==3 )? "Mar": (number1 ==4 )? "Apr": (number1 ==5 )? "May":
                    (number1 ==6 )? "Jul": (number1 ==7 )? "Jul": (number1 ==8 )? "Aug": (number1 ==9 )? "Sep": (number1 ==10 )? "Oct":
                            (number1 ==11 )? "Nov": "Dec";

        }else {
            name2 = "Invalid";
        }


        switch (number1){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days= 28;
        }

        System.out.println(name2 + " has " + days + " days.");

    }







}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */
