package sorting_algorithms;

import java.util.Random;

public class Quickshort {

    //Performing quickshort
    public static void quicksort(int[] array, int lowIndex, int highIndex ){

        if (lowIndex >= highIndex){ return;}

        //Choosing pivot
            //Choose highest number as pivot
                //int pivot = array[highIndex];

            //Choose pivot Randomly
            int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
            int pivot = array[pivotIndex];
            swap(array,pivotIndex,highIndex);

        partitioning(array, lowIndex, highIndex, pivot);
    }

    //Quicksort method with less constructor attributes for easier calling
    public static void quicksort(int[] array){
        quicksort(array, 0, array.length-1);
    }

    //Partitioning
    private static void partitioning(int[] array, int lowIndex, int highIndex, int pivot) {
        //Find pointers (Left pointer - Right pointer)
        //If a pointer is smaller than the pivot move left from pivot
        //Otherwise move right of the pivot
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){

            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);


        }

        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer -1);

        quicksort(array, leftPointer + 1, highIndex);
    }

    //Swap
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;
    }


}
