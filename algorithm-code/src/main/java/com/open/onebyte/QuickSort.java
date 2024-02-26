package com.open.onebyte;

/**
 * @author yqk
 */
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // 交换元素
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            // 递归排序左半部分
            quickSort(arr, low, j);
        }
        if (high > i) {
            // 递归排序右半部分
            quickSort(arr, i, high);
        }
    }
}
