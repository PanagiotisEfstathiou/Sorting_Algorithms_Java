package building_and_printing_the_array;

import sorting_algorithms.Mergesort;
import sorting_algorithms.bubblesort;

import java.util.Random;

public class Main_mergesort {

    public static void main(String[] args) {
        //Initiating variables, one Random and one array
        Random random = new Random();
        int[] numbers = new int[0];

        numbers = Array.buildArray(numbers, random);

        System.out.println("Before mergesort: ");
        Array.printArray(numbers);

        System.out.println("After mergesort: ");
        Mergesort.mergesort(numbers);
        Array.printArray(numbers);
    }
}
