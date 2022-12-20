package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,3,4,4,5,6,7,7,};

        int[] arr2 = removeDuplicates(arr1);

        System.out.println(Arrays.toString(arr2));
    }

    //removes duplicated elements of the given array, return as a new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.contains(result,each)){
                continue;
            }
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //removes duplicated elements of the given array, return as a new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.contains(result,each)){
                continue;
            }
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //removes duplicated elements of the given array, return as a new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.contains(result,each)){
                continue;
            }
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //removes duplicated elements of the given array, return as a new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.contains(result,each)){
                continue;
            }
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
    
    
    
    
}
