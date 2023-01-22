package day47_Polymoprhism;


import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;

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

    }

}
