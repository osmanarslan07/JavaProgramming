package day04_Variables;

public class Currencies {
    public static void main(String[] args) {

        int dollar = 1000;

        double euro = dollar * 0.86;
        double lira = dollar * 9.53;
        double jpy = dollar * 142.46;
        double pound = dollar * 0.86;
        double peso = dollar * 56.82;
        double cad = dollar * 1.30;
        double riyal = dollar * 3.76;


        System.out.println("dollar = $" + dollar);
        System.out.println("lira = ₺" + lira);
        System.out.println("euro = €" + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("peso = " + peso);
        System.out.println("cad = " + cad);
        System.out.println("riyal = " + riyal);

        // jpy, pound, peso, cad, riyal



    }
}
