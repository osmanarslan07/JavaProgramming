package day38_Inheritance.carTask;

public class Bmw extends Car{


    public Bmw(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand + " "+ model+ " is a racing car");
    }


    public void start() {
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }
}
