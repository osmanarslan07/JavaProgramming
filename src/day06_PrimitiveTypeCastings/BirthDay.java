package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {
        String name = "Osman",
                birthMonth = "September";

        int birthDay = 5,
                birthYear= 1994;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear);

        System.out.println("---------------------");

        // My favorite book is "bookName"

        String bookName = "Rich Dad and Poor Dad";

        System.out.println("My favorite book is \"" + bookName + "\"");

        /*
        \n => new line
        \t => tab
        \" => prints "
        \' => prints '
        \\ => prints \
         */



    }
/*
name, birthDay(int), birthMonth(String),
birthYear(int)
 use concatenation to display the birthday of
the person
 if  name = "John"
 birthDay = 25
     birthMonth = "April"
     birthYear = 1995;
 output:
 John was born on
April/25/1995.
 */


}
