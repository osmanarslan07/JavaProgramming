package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100,
                n2 = 100;

        boolean n1minimum = n1 < n2;
        boolean n2minimum = n2 < n1;
        boolean equal = n1 == n2;

        if (n1minimum){ // if n1 is the minimum number
            System.out.println(n1 + " is the minimum number ");
        }
        if (n2minimum){  // if n2 is the minimum number
            System.out.println(n2 + " is the minimum number");
        }
        if (equal){ // if n1 and n2 is equal
            System.out.println(n1 + " and " + n2 + " is equal.");
        }



    }


}
