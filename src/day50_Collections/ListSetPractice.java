package day50_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class ListSetPractice {


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        //Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list =  new ArrayList<>(set);

        System.out.println(list);

        //List<String > names = null;

       // System.out.println(names.size());  --> This will cause NullPointerException

        System.out.println("----------------------------------------------");

        //pop()

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars);

        ((Stack)chars).pop();

        System.out.println("chars = " + chars);


        //poll()  ==> FIFO

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println("names = " + names);

        ((LinkedList)names).poll();

        System.out.println("names = " + names);

        ((LinkedList)names).poll();

        System.out.println("names = " + names);

        ((LinkedList)names).poll();

        System.out.println("names = " + names);

        ((LinkedList)names).poll();

        System.out.println("names = " + names);



    }

}
