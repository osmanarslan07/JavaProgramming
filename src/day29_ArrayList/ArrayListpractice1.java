package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListpractice1 {


    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        //converting array to arrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p-> p.length()>=10);

        //converting arrayList to array
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));



    }



}
/*
 1.create an Array of string called countries
 2.write a program that can remove all the country names that have length of 10 or greater
 */