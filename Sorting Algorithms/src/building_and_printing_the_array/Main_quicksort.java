package building_and_printing_the_array;



import sorting_algorithms.Quickshort;

import java.util.Random;

public class Main_quicksort {


    public static void main(String[] args) {
        //Initiating variables, one Random and one array
        Random random = new Random();
        int[] numbers = new int[0];

        //Calling buildArray method from Array class, inserting array into numbers array
        numbers = Array.buildArray(numbers, random);

        //Printing array before quicksort
        System.out.println("Before Quicksort: ");
        Array.printArray(numbers);
        //Printing array after quicksort
        System.out.println("After Quicksort: ");
        Quickshort.quicksort(numbers);
        Array.printArray(numbers);


    }




}


