package Utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtils<T> {
    public static <T> T[] arrExtends(T[] arr, int length) {
        return Arrays.copyOf(arr, length);
    }
    public static <T> void swap (T[] arr, int base, int next) {
        T temp = arr[base];
        arr[base] = arr[next];
        arr[next] = temp;
    }
    public static void swap (int[] arr, int base, int next) {
        int temp = arr[base];
        arr[base] = arr[next];
        arr[next] = temp;
    }
}
