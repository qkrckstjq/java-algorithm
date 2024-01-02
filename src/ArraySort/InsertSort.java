package ArraySort;

import Utils.ArrayUtils;

import java.util.Arrays;

public class InsertSort <T extends Comparable<T>> {
    public static <T extends Comparable<T>> void sort (T[] arr) {
        int startIndex = 0;
        while(startIndex+1 <= arr.length-1) {
            inserting(arr, startIndex);
            startIndex++;
        }
    }
    private static <T extends Comparable<T>> void inserting (T[] arr, int index) {
        int baseIndex = index;
        int keyIndex = baseIndex+1;
        while(arr[baseIndex].compareTo(arr[keyIndex]) > 0) {
            ArrayUtils.swap(arr, baseIndex, keyIndex);
            keyIndex = baseIndex;
            baseIndex = keyIndex - 1;
            if(baseIndex < 0) {
                break;
            }
        }
    }
}
