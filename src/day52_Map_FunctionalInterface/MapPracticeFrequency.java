package day52_Map_FunctionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPracticeFrequency {

    public static void main(String[] args) {
        String str = "eeeeeaaabbbbccccdd";

        String[] arr = str.split("");

        Map<String , Integer> map = new LinkedHashMap<>();
        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            map.put(each, frequency);
        }
        int maxFrequency = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue()>maxFrequency){
                maxFrequency = pair.getValue();
            }
        }
        String key = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(maxFrequency)){
               key = entry.getKey();
            }
        }

        System.out.println(map);
        System.out.println("character " + key + " has the highest frequency");


    }
}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
 */