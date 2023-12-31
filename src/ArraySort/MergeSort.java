package ArraySort;

public class MergeSort<T extends Comparable<T>> {
    public static <T extends Comparable<T>> void sort (T[] arr) {
        T[] sortedArray = merge(arr, 0, arr.length - 1);
        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
    }
    private static <T extends Comparable<T>> T[] sorting (T[] left, T[] right) {
        T[] result = (T[]) new Comparable[left.length + right.length];
        int i = 0, j = 0;
        int idx = 0;
        while(i < left.length && j < right.length) {
            if(left[i].compareTo(right[j]) > 0) {
                result[idx] = right[j];
                j++;
            } else {
                result[idx] = left[i];
                i++;
            }
            idx++;
        }
        while(i < left.length) {
            result[idx] = left[i];
            i++;
            idx++;
        }
        while(j < right.length) {
            result[idx] = right[j];
            j++;
            idx++;
        }

        return result;
    }
    private static <T extends Comparable<T>> T[] merge (T[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            T[] temp = (T[]) new Comparable[1];
            temp[0] = arr[startIndex];
            return temp;
        }
        int midIndex =  (startIndex+endIndex) / 2;
        T[] left = merge(arr, startIndex, midIndex);
        T[] right = merge(arr, midIndex+1, endIndex);
        return sorting(left, right);
    }
}
