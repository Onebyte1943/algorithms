package com.open.onebyte;

/**
 * 二分查找
 *
 * @author yqk
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            // 找到元素
            if (guess == num) {
                return mid;
            } else if (guess < num) { // 小了
                low = mid + 1;
            } else { // 大了
                high = mid - 1;
            }
        }
        return -1;
    }
}
