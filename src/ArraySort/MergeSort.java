package ArraySort;

public class MergeSort<T extends Comparable<T>> {
    public static <T extends Comparable<T>> void sort (T[] arr) {
        merge(arr, 0, arr.length - 1);
    }
    private static <T extends Comparable<T>> void merge (T[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex){
            return;
        }
        int midIndex =  (startIndex + endIndex) / 2;
        merge(arr, startIndex, midIndex);
        merge(arr, midIndex + 1, endIndex);
        sorting(arr, startIndex, midIndex, midIndex + 1, endIndex);
    }
    private static <T extends Comparable<T>> void sorting (T[] arr, int i_s, int i_e, int j_s, int j_e) {
        T[] sorted = (T[]) new Comparable[j_e - i_s + 1];
        int start = i_s;
        int end = j_e;
        int index = 0;
        while (i_s <= i_e && j_s <= j_e) {
            if (arr[i_s].compareTo(arr[j_s]) < 0) {
                sorted[index] = arr[i_s];
                i_s++;
            }
            else if (arr[i_s].compareTo(arr[j_s]) > 0) {
                sorted[index] = arr[j_s];
                j_s++;
            }
            else {
                sorted[index] = arr[i_s];
                sorted[index] = arr[j_s];
                i_s++;
                j_s++;
                index++;
            }
            index++;
        }
        while (i_s <= i_e) {
            sorted[index] = arr[i_s];
            i_s++;
            index++;
        }
        while (j_s <= j_e) {
            sorted[index] = arr[j_s];
            j_s++;
            index++;
        }
        index = 0;
        for (int i = start; i <= end; i++) {
            arr[i] = sorted[index];
            index++;
        }
    }
//        T[] result = (T[]) new Comparable[left.length + right.length];
//        int i = 0, j = 0;
//        int idx = 0;
//        while (i < left.length && j < right.length) {
//            if (left[i].compareTo(right[j]) > 0) {
//                result[idx] = right[j];
//                j++;
//            } else {
//                result[idx] = left[i];
//                i++;
//            }
//            idx++;
//        }
//        while (i < left.length) {
//            result[idx] = left[i];
//            i++;
//            idx++;
//        }
//        while (j < right.length) {
//            result[idx] = right[j];
//            j++;
//            idx++;
//        }
//        return result;
//        }
}

//package ArraySort;
//
//public class MergeSort<T extends Comparable<T>> {
//    public static <T extends Comparable<T>> void sort (T[] arr) {
//        T[] sortedArray = merge(arr, 0, arr.length - 1);
//        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
//    }
//    private static <T extends Comparable<T>> T[] merge (T[] arr, int startIndex, int endIndex) {
//        if(startIndex >= endIndex) {
//            T[] temp = (T[]) new Comparable[1];
//            temp[0] = arr[startIndex];
//            return temp;
//        }
//        int midIndex =  (startIndex+endIndex) / 2;
//        T[] left = merge(arr, startIndex, midIndex);
//        T[] right = merge(arr, midIndex+1, endIndex);
//        return sorting(left, right);
//    }
//    private static <T extends Comparable<T>> T[] sorting (T[] left, T[] right) {
//        T[] result = (T[]) new Comparable[left.length + right.length];
//        int i = 0, j = 0;
//        int idx = 0;
//        while (i < left.length && j < right.length) {
//            if (left[i].compareTo(right[j]) > 0) {
//                result[idx] = right[j];
//                j++;
//            } else {
//                result[idx] = left[i];
//                i++;
//            }
//            idx++;
//        }
//        while (i < left.length) {
//            result[idx] = left[i];
//            i++;
//            idx++;
//        }
//        while (j < right.length) {
//            result[idx] = right[j];
//            j++;
//            idx++;
//        }
//        return result;
//    }
//}
//
//
