package com.open.onebyte;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        int[] array = {1, 3, 5, 7, 9};
        int num = 10;
        int search = BinarySearch.binarySearch(array, num);
        System.out.println(search);
    }

    public void testBinarySearch() {
        int[] array = {1, 3, 5, 7, 9};
        int num = 10;
        int search = BinarySearch.binarySearch(array, num);
        System.out.println(search);
    }

    public void testSelectionSort() {
        int[] array = {5, 3, 6, 2, 10, 15, 0, 230};
        int[] selectionSort = SelectionSort.selectionSort(array);
        System.out.println(Arrays.toString(selectionSort));
    }

    public void testSelectionSort2() {
        int[] array = {5, 3, 6, 2, 10, 15, 0, 230};
        int[] selectionSort = SelectionSort2.selectionSort(array);
        System.out.println(Arrays.toString(selectionSort));
    }

    public void testQuickSort() {
        int[] array = {5, 3, 6, 2, 10, 15, 0, 230};
        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
