package org.example.algorithmic_exercises;

public class SortingAlgorithms {
    /**
     * 1. This is the bubble sorting algorithm
     * O(n^2)
     */
    public int[] myBubbleSort(int[] arr) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        } // printing sorted arr
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        return arr;
    }

    /**
     * 2. This is a selection sorting algorithm
     *
     * @param arr
     * @return
     */
    public int[] mySelectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j])
                    minIndex = j;
            }
            // swapping min and 1st element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /**
     * 3. This is a insertion sorting algorithm
     * O(n^2)
     *
     * @param arr
     * @return
     */
    public int[] myInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i - 1; // for comparing with previous member
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
        return arr;
    }


    public static void main(String[] args) {
        SortingAlgorithms obj = new SortingAlgorithms();

        int[] arr = {5, 3, 6, 1};
        obj.myBubbleSort(arr);


    }
}
