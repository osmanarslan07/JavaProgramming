package day09_IfStatements;

public class MinimumNumber {

    public static void main(String[] args) {

        int num1 = 25,
                num2 = 20;

        boolean isnum1Min = num1 < num2;
        boolean isnum2Min = num2 < num1;

        if (isnum1Min){
            System.out.println(num1 + " is minimum number");
        }else {
            System.out.println(num2 + " is the minimum number");
        }


    }


}
