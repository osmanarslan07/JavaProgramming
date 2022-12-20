package day14_String;

public class emailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        //domain
        int beginningIndex = email.indexOf("@") +1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        System.out.println("--------------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        //
        String s1 = str1.substring(0, 10+1);  // Java is fun

        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end); // Java is cool

        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



/*
        String email1 = "Cydeo.School@gmail.com";

        String domain1 = email1.substring(email1.indexOf("@")+1 , email1.lastIndexOf("."));

        System.out.println(domain1);

        String email2 = "School.Cydeo@yahoo.com";

        String domain2 = email2.substring(email2.indexOf("@")+1 , email2.lastIndexOf("."));

        System.out.println(domain2);
        */
    }
            /*
        Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo

         */
}
