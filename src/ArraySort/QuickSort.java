package ArraySort;

import Utils.ArrayUtils;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> {
    private static final int START_INDEX = 0;
    public static <T extends Comparable<T>> void sort (T[] arr) {
        recursion(arr, START_INDEX, arr.length-1);
    }
    private static <T extends Comparable<T>> void recursion (T[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }
        int pivot = partialSorting(arr, startIndex, endIndex);
        recursion(arr, startIndex, pivot-1);
        recursion(arr, pivot, endIndex);
    }

    private static <T extends Comparable<T>> int partialSorting (T[] arr, int startIndex, int endIndex) {
        int pivot = startIndex;
        startIndex++;
        while(startIndex < endIndex) {
            while (startIndex < endIndex && arr[startIndex].compareTo(arr[pivot]) < 0) {
                startIndex++;
            }
            while (startIndex < endIndex && arr[endIndex].compareTo(arr[pivot]) > 0) {
                endIndex--;
            }
            if (startIndex < endIndex) {
                ArrayUtils.swap(arr, startIndex, endIndex);
            }
        }
        if(arr[pivot].compareTo(arr[startIndex]) > 0) {
            ArrayUtils.swap(arr, pivot, startIndex);
        }
        return endIndex;
    }
}
