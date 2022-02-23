package Options_menu;

import building_and_printing_the_array.Array;
import sorting_algorithms.Mergesort;
import sorting_algorithms.Quickshort;
import sorting_algorithms.bubblesort;

import java.util.Random;

public class menu {

    public static void menu(String choice){

        switch (choice){
            case "1":
                Random random = new Random();
                int[] numbers = new int[0];

                numbers = Array.buildArray(numbers, random);

                System.out.println("Before bubblesort: ");
                Array.printArray(numbers);

                System.out.println("After bubblesort: ");
                bubblesort.bubblesort(numbers);
                Array.printArray(numbers);
                break;

            case "2":

                random = new Random();
                numbers = new int[0];
                //Calling buildArray method from Array class, inserting array into numbers array
                numbers = Array.buildArray(numbers, random);

                //Printing array before quicksort
                System.out.println("Before Quicksort: ");
                Array.printArray(numbers);
                //Printing array after quicksort
                System.out.println("After Quicksort: ");
                Quickshort.quicksort(numbers);
                Array.printArray(numbers);
                break;

            case "3":

                random = new Random();
                numbers = new int[0];
                numbers = Array.buildArray(numbers, random);

                System.out.println("Before mergesort: ");
                Array.printArray(numbers);

                System.out.println("After mergesort: ");
                Mergesort.mergesort(numbers);
                Array.printArray(numbers);
                break;

            case "0":
                break;



                default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

}
