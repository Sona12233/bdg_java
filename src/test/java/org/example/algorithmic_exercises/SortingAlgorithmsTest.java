package org.example.algorithmic_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {
    SortingAlgorithms obj = new SortingAlgorithms();
    int[] arr = {5, 3, 6, 1};
    int[] sorted = {1, 3, 5, 6};
    int[] random = {2, 3, 0, 6};

    @Test
    void myBubbleSort() {
        assertArrayEquals(sorted, obj.myBubbleSort(arr));
        assertTrue(arr == obj.myBubbleSort(arr)); // not getting this line
        assertFalse(arr == obj.myBubbleSort(sorted));
    }

    @Test
    void mySelectionSort() {
        assertArrayEquals(sorted, obj.mySelectionSort(arr));
        assertFalse(random == obj.mySelectionSort(arr));
    }

    @Test
    void myInsertion() {
        assertArrayEquals(sorted, obj.myInsertionSort(arr));
        assertFalse(random == obj.myInsertionSort(arr));
    }
}