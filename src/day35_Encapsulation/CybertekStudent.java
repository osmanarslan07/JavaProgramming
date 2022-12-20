package day35_Encapsulation;

public class CybertekStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;

    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;


    public CybertekStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
     programmingLanguage = "Java";
     schoolName = "CYDEO";
     secretCode = "Wooden Spoon";

    }

    public static void printProgrammingLanguage(){
        System.out.println("Language is = " + programmingLanguage);
    }

    public static void printSchoolName(){
        System.out.println("school is "+schoolName);
    }

    public static void printSecretCode(){
        System.out.println("code is "+secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", programming language ='" + programmingLanguage + '\'' +
                ", school='" + schoolName + '\'' +
                '}';
    }
}
/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */