package SortQu;

import Conn.ConnUtils;

/**
 * @author Bmo
 * @date 2019/11/3 20:06
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 1; i < arr.length; ++i) {
            int j = i - 1;
            int cur = arr[i];
            while(j >= 0 && arr[j] > cur) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = cur;
        }
    }
}
