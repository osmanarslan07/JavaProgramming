package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100; // static & final by default
    static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){
        this.a=a;
    }
     */

    /*
    static {
        b = 100;
    }
     */

    /*
    public void method1(){
        System.out.println("Instance method");
    }
     */

    static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3(); // abstract method will have different bodies in different classes

    default void method4(){ // if the body will be the same for all the classes
        System.out.println("Default method");
    }



}
