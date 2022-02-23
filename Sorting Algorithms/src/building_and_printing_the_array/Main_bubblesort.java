package building_and_printing_the_array;

import java.util.Random;

import sorting_algorithms.bubblesort;

public class Main_bubblesort {

    public static void main(String[] args) {
        //Initiating variables, one Random and one array
        Random random = new Random();
        int[] numbers = new int[0];

        numbers = Array.buildArray(numbers, random);

        System.out.println("Before bubblesort: ");
        Array.printArray(numbers);

        System.out.println("After bubblesort: ");
        bubblesort.bubblesort(numbers);
        Array.printArray(numbers);


    }

}
