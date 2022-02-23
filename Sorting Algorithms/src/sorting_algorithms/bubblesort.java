package sorting_algorithms;

import building_and_printing_the_array.Array;

import java.util.Random;

public class bubblesort {

    public static void bubblesort(int[] array) {
        Random random = new Random();
        bubbleSort(array, random);
    }

    public static void bubbleSort(int[] array, Random random){
        Array.buildArray(array, random);
        boolean isSwapped = true;

        while (isSwapped){

            isSwapped = false;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i+1]){
                    isSwapped = true;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                }
            }

        }
    }


}
