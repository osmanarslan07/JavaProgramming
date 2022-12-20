package day14_String;

public class Stringmethod2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); //Python is fun, I love learning Python

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email); // gmail

        String sentence =" Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "");

        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("   ", " ");

        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog";
        String s2 = s.replace("Dog", "Cat");

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);

        String s3 = "C# is fun, C# is cool";

        s3 = s3.replace(" C#", " Java");

        System.out.println("s3 = " + s3);

        String s4 = "Java";

        s4 = s4.replace("a", "e");

        System.out.println("s4 = " + s4);

        System.out.println("-------------------------------------");

        String result ="Java Java Java";

        //result = result.replace("Java", "Python");
        result = result.replaceFirst("Java", "Python");


        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");

        System.out.println("result2 = " + result2);

        String result3 = "Java";

        result3= result3.replaceFirst("va", "vo"); //"Javo"

        System.out.println("result3 = " + result3);





    }



}
