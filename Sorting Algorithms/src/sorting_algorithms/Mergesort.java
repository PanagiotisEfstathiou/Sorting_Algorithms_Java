package sorting_algorithms;

public class Mergesort {

    public static void mergesort(int[] inputArray){
        int inputLength = inputArray.length;

        if (inputLength < 2){
            return;
        }

        int midIndex  = inputLength / 2;
        int [] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergesort(leftHalf);
        mergesort(rightHalf);

        merge(inputArray,leftHalf,rightHalf);

        //Merge
    }

    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j= 0, k= 0;

        while (i<leftSize && k<rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i<leftSize){
            inputArray[k]= leftHalf[i];
            i++;
            k++;
        }

        while (j<rightSize){
            inputArray[k]= rightHalf[j];
            j++;
            k++;
    }
}
}
