package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //short b = (short)a;
        //      (short) a

        int c = b;
        // int c = (int)b;

        long d = c;
        // long d = (long) c;

        float e= d;
        double f= e;

        System.out.println("_----------------------------");

        int x= 55;
        short y= (short) x; // explicit casting

        System.out.println(x + " : " + y);

        long j= 1000000;
        short k= (short)j;

        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float) l;

        System.out.println(l +" : "+m);

        double n = 10.8;
        int s = (int)n;

        System.out.println(s + " : " + n);

        System.out.println("_----------------------------");


        double d1 = 20.5;
        short s1 = (short) d1; // alt + enter to choose casting automaticly

        System.out.println(d1 + " : " + s1 );

        System.out.println("_----------------------------");

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1);





    }

}
