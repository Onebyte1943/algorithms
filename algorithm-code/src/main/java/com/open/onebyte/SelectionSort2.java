package com.open.onebyte;

/**
 * 选择排序，优化版本
 *
 * @author yqk
 */
public class SelectionSort2 {

    public static int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            // // 寻找 [i, n) 区间里的最小值
            for (int j = i; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // 将找到的最小值与当前位置交换
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

}
