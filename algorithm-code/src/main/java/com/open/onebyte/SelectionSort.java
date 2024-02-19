package com.open.onebyte;

/**
 * 选择排序，原始版本，不优雅
 *
 * @author yqk
 */
public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            // 找到最小元素
            int smallestIndex = findSmallest(array);
            // 复制到新的数组
            sortedArray[i] = array[smallestIndex];
            // 剔除掉该最小元素，进行下一轮
            removeByIndex(array, smallestIndex);
        }
        return sortedArray;
    }

    private static void removeByIndex(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    private static int findSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
