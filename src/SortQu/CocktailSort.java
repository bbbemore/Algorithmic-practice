package SortQu;

import Conn.ConnUtils;

/**
 * @author Bmo
 * @date 2019/10/30 16:30
 */
public class CocktailSort {
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            for (int i = left; i < right; ++i) {
                if (arr[i] > arr[i+1]) ConnUtils.swap(arr, i, i+1);
            }
            --right;
            for (int i = right; i > left; --i) {
                if (arr[i] < arr[i-1]) ConnUtils.swap(arr, i, i-1);
            }
            ++left;
        }
    }
    public void sortEarlyReturn(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int left = 0, right = arr.length - 1;
        boolean swapped;
        while (left < right) {
            swapped = false;
            for (int i = left; i < right; ++i) {
                if (arr[i] > arr[i+1]) {
                    ConnUtils.swap(arr, i, i+1);
                    swapped = true;
                }
            }
            --right;
            for (int i = right; i > 0; --i) {
                if (arr[i-1] < arr[i]) {
                    ConnUtils.swap(arr, i, i+1);
                    swapped = true;
                }
            }
            ++left;
        }

    }
    public void sortSkip(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int left = 0, right = arr.length - 1;
        int newLeft, newRight;
        while (left < right) {
            newRight = left;
            for (int i = left; i < right; ++i) {
                if (arr[i] > arr[i+1]) {
                    ConnUtils.swap(arr, i, i+1);
                    newRight = i;
                }
            }
            right = newRight;

            newLeft = right;
            for (int i = right; i > left; --i) {
                if (arr[i-1] > arr[i]) {
                    ConnUtils.swap(arr, i-1, i);
                    newLeft = i;
                }
            }
            left = newLeft;
        }
    }

}
