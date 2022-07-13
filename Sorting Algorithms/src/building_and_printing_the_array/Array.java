package building_and_printing_the_array;

import java.util.Random;

public class Array {

    //Building the array and returning the array
    public static int[] buildArray(int[] numbers, Random random){

          //Change that value to change how many numbers are included in the array
          numbers = new int[100];
          random = new Random();

         //Change the bound value to change the range of the possible numbers
         for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(10000);
        }

         return numbers;
    }

    //Printing the array
    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
