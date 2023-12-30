package MergeSort;

public class MergeSort {
    public static int[] sort (int[] arr) {
        return merge(arr, 0, arr.length-1);
    }
    private static int[] sorting (int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0;
        int idx = 0;
        while(i < left.length && j < right.length) {
            if(left[i] > right[j]) {
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
    private static int[] merge (int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            int[] temp = new int[1];
            temp[0] = arr[startIndex];
            return temp;
        }
        int midIndex =  (startIndex+endIndex) / 2;
        int[] left = merge(arr, startIndex, midIndex);
        int[] right = merge(arr, midIndex+1, endIndex);
        return sorting(left, right);
    }
}
