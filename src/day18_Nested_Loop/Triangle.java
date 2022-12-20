package day18_Nested_Loop;

public class Triangle {

    public static void main(String[] args) {

        String s = "* ";

        for (int j = 0; j <10 ; j++) {

            for (int i = 0; i < 1; i++) {
                System.out.println(s);
            }
            s+="* ";
        }



    }

}
