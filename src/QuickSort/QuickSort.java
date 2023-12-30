package QuickSort;

import Utils.ArrayUtils;

import java.util.Arrays;

public class QuickSort {
    private static final int START_INDEX = 0;
    public static void sort (int[] arr) {
        recursion(arr, START_INDEX, arr.length-1);
    }
    public static void recursion (int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }
        int pivot = partialSorting(arr, startIndex, endIndex);
        recursion(arr, startIndex, pivot-1);
        recursion(arr, pivot, endIndex);
    }

    private static int partialSorting (int[] arr, int startIndex, int endIndex) {
        int pivot = startIndex;
        startIndex++;
        while(startIndex < endIndex) {
            while (startIndex < endIndex && arr[startIndex] < arr[pivot]) {
                startIndex++;
            }
            while (startIndex < endIndex && arr[endIndex] > arr[pivot]) {
                endIndex--;
            }
            if (startIndex < endIndex) {
                ArrayUtils.swap(arr, startIndex, endIndex);
            }
        }
        if(arr[pivot] > arr[startIndex]) {
            ArrayUtils.swap(arr, pivot, startIndex);
        }
        return endIndex;
    }
}
