package org.example.java_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaArraysTest {

    JavaArrays obj = new JavaArrays();

    @Test
    void arr1PositiveMembers() {
        int[] arr = {2, -3, 0, 3};
        int[] arr2 = {2, 3};
        assertArrayEquals(arr2, obj.arrPositiveMembers(arr));

    }

    @Test
    void reversedArray() {
        short[] a = {1, 2, 3};
        short[] b = {3, 2, 1};
        assertArrayEquals(b, obj.reversedArray(a));
    }

    @Test
    void arraysMax() {
        long[] l = {1, 2, 3};
        long max = 3;
        assertTrue(max == obj.arraysMax(l));
        assertEquals(3, obj.arraysMax(l));
    }

    @Test
    void arraysMin() {
        float[] f = {1, 2, 3};
        float min = 1;
        assertEquals(1.0, obj.arraysMin(f));
    }

    @Test
    void method5() {
        int[] n = {2, 3, 4};
        int[] m = {2, 3, 4};
        assertArrayEquals(m, obj.method5(n));
    }

    @Test
    void method6() {
        int[] a = {1, 1, 1};
        int[] b = {2, 2, 2};
        int[] ab = {3, 3, 3};
        assertArrayEquals(ab, obj.method6(a, b));
        assertFalse(a == obj.method6(b, ab));
    }

    @Test
    void method7() {
        int[] a = {1, 1, 3, 1};
        int k = 3;
        assertEquals(k, obj.method7(a));
        assertFalse(5 == obj.method7(a));
    }

    @Test
    void method9() {
        int[] a = {2, 1, 3};
        int[] b = {3, 2, 1};
        assertArrayEquals(b, obj.method9(a));
        assertFalse(a == obj.method9(b));
    }

    @Test
    void evenOdd() {
        int[] a = {2, 1, 3, 6, 8};
        int[] b = {2,8,6,3,1};
        assertArrayEquals(b, obj.evenOdd(a));
        assertFalse(a == obj.evenOdd(b));
    }

    @Test
    void removeZeros() {
        int a[] = {0, 3, 0, 6};
        int b[] = {3, 6};
        assertArrayEquals(b, obj.removeZeros(a));
        assertArrayEquals(b, obj.removeZeros(b));
    }

//    @Test //TODO
//    void maxAscSub() {
//        int[] array = {1, 5, 6, 4, 5, 9, 125};
//        int[] b = {4, 5, 9, 125};
//        assertArrayEquals(b, obj.maxAscSub(array));
//    }

    @Test
    void binaryToDecimal() {
        int[] array = {1, 0, 1, 0};
        assertEquals(10, obj.binaryToDecimal(array));
    }

    @Test
    void upperMatrix() {
    }

    @Test
    void reverseMartix() {
        int[][] a = {{1,2},
                     {3,4}};
        int[][] b = {{1,3},
                     {2,4}};
        assertArrayEquals(b, obj.reverseMartix(a));
    }

    @Test
    void isMatrixsStingMembersSumEven() {
        int[][] a = {{2,4},{1,3}};
        int[][] b = {{1,4},{1,3}};
        assertEquals(true, obj.isMatrixsStingMembersSumEven(a));
        assertTrue(false == obj.isMatrixsStingMembersSumEven(b));
    }
}