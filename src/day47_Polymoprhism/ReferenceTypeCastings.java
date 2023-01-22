package day47_Polymoprhism;


import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


        //Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        //WebDriver driver = (WebDriver) new ChromeDriver();

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal;

        System.out.println(animal.getName());
        System.out.println(dog.getName());


        ((Dog)animal).bark();

        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());


        System.out.println("------------------------------------------------------");

        Animal animal2 = new Cat("Lucy", "Scottish",'M', 3,"Small","White") ;

        //Cat cat = (Cat) animal2;
        //cat.meow();

        ((Cat) animal2).meow();

       // ((Dog)animal2).bark();

        System.out.println("------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ((Tester)employee).bugReport();

       // ((Tester)employee).unitTest(); // Tester class doesn't have unitTest() method


        // ((Developer)employee).unitTest(); // Developer and Tester class doesn't have "IS A" relation

       // Driver driver = (Driver) employee; // Driver and Tester class doesn't have "IS A" relation
        Person person = (Person) employee;
       // Teacher teacher = (Teacher) employee; // Teacher and Tester class doesn't have "IS A" relation

        System.out.println("-----------------------------------------");

        Shape s1 = new Circle(10);

        s1.area();
        s1.perimeter();

       // ((Cube) s1).volume();







    }

}
