package day38_Inheritance.carTask;

public class Bmw extends Car{
    public Bmw(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand + " "+ model+ " is a racing car");
    }
}
